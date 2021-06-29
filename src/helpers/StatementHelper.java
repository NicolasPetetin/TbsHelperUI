package helpers;

public class StatementHelper {
	public static String parseStatement(String statement) {
		String res = statement;
		if(StringHelper.isNotBlank(res)) {
			res = removeComments(res);
			res = removeLeadingQuotes(res);
			res = removeTrailingQuotes(res);
			res = removeLeadingParenthesisSpaces(res);
			res = removeTrailingParenthesisSpaces(res);
			res = removeSpaceCharacters(res);
		}
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
	
	public static String removeSpaceCharacters(String statement) {
		return statement.replaceAll("(\\s){1,}", "\1");
	}
	
	public static String removeLeadingParenthesisSpaces(String statement) {
		return statement.replaceAll("\\(\\s+", "(");
	}
	
	public static String removeTrailingParenthesisSpaces(String statement) {
		return statement.replaceAll("\\s+\\)", ")");
	}
}
