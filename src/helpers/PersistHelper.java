package helpers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import constants.TbsConstants;
import model.TbsPersistence;

public class PersistHelper {
	public static TbsPersistence doParsePersistence(String persists) {
		TbsPersistence result = new TbsPersistence();
		StringTokenizer tokenizer = new StringTokenizer(persists, TbsConstants.PERSIST_DELIMITER);
		while(tokenizer.hasMoreTokens()) {
			try {
				String persist = tokenizer.nextToken();
				String[] persistData = persist.split("\t");
				String name = persistData[0];
				String value = persistData[1];
				result.add(name, value);
			}catch (Exception e) {
				continue;
			}
		}
		return result;
	}
	
	public static List<String> getDistinctPersists(TbsPersistence persist){
		List<String> result = new ArrayList<String>();
		Map<String, String> persistValues = persist.getValues();
		for(String key : persistValues.keySet()) {
			String beginPersist = getBeginPersist(key);
			if(!result.stream().anyMatch(resPersist -> resPersist.startsWith(beginPersist))) {
				result.add(beginPersist);
			}
		}
		
		return result;
	}
	
	public static String getBeginPersist(String persistName) {
		int index = persistName.indexOf(".");
		if(index == -1) {
			return persistName; 
		}
		return persistName.substring(0, index);
	}
	
	public static boolean isTableauPersist(TbsPersistence persist, String persistName) {
		return persist.exists(persistName + ".NB");
	}
	
	public static boolean isColumnPersist(String persistName) {
		return persistName.matches(".+\\..+\\d+");
	}
	
	public static boolean isPersistForTable(String key, String persistName) {
		return persistName.equals(getBeginPersist(key));
	}
	
	public static String[] getTableColumns(TbsPersistence persist, String persistName) {
		Set<String> columns = new HashSet<String>();
		Map<String, String> persists = persist.getValues();
		for(String key : persists.keySet()) {
			if(isColumnPersist(key) && isPersistForTable(key, persistName)) {
				columns.add(getColumnName(key, persistName));
			}
		}
		return columns.stream().toArray(n -> new String[n]);
	}
	
	public static String getColumnName(String persistName, String mainPersistName) {
		Pattern pattern = Pattern.compile(mainPersistName + "\\.(\\D+)\\d+");
		Matcher matcher = pattern.matcher(persistName);
		matcher.find();
		return matcher.group(1);
	}
	
	public static int getTableNbRows(TbsPersistence persist, String persistName) {
		String nbPersist = persist.get(persistName + ".NB");
		return Integer.parseInt(nbPersist);
	}

	public static String[][] getTableData(TbsPersistence persist, String[] columns, String persistName) {
		int nbRows = getTableNbRows(persist, persistName);
		String[][] result = new String[nbRows][columns.length];
		if(nbRows != 0) {
			Map<String, String> persists = persist.getValues();
			int currentLine = 0;
			for(String key : persists.keySet()) {
				if(isColumnPersist(key) && isPersistForTable(key, persistName)){
					for(int i=0; i<columns.length; i++) {
						String column = columns[i];
						if(getColumnName(key, persistName).equals(column)) {
							String persistValue = persist.get(key);
							result[currentLine][i] = persistValue;
							break;
						}
					}
				}
			}
		}
		return result;
	}
}
