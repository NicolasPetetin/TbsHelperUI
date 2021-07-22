package helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import constants.TbsConstants;
import model.TbsPersistence;

public class PersistHelper {
	public static TbsPersistence doParsePersistence(String persists) {
		TbsPersistence result = new TbsPersistence();
		StringTokenizer tokenizer = new StringTokenizer(persists, TbsConstants.PERSIST_DELIMITER);
		while(tokenizer.hasMoreTokens()) {
			String persist = tokenizer.nextToken();
			String[] persistData = persist.split("\t");
			String name = persistData[0];
			String value = persistData[1];
			result.add(name, value);
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
}
