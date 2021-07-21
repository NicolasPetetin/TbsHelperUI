package helpers;

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
		return null;
	}
}
