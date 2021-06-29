package helpers;

public class StatementHelper {
	public static String parseStatement(String statement) {
		String res = statement;
		res = removeComments(res);
		res = removeLeadingQuotes(res);
		res = removeTrailingQuotes(res);
		return res;
	}
	
	public static String removeComments(String statement) {
		return statement.replaceAll("//.*", "");
	}
	
	public static String removeLeadingQuotes(String statement) {
		return statement.replaceAll("\"\\s*\\+?", "");
	}
	
	public static String removeTrailingQuotes(String statement) {
		return statement.replaceAll("\\+?\\s*\"", "");
	}
}
