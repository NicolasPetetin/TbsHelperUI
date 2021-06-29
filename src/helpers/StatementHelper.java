package helpers;

import enums.StatementType;

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
		return statement.replaceAll("(\\s){1,}", " ");
	}
	
	public static String removeLeadingParenthesisSpaces(String statement) {
		return statement.replaceAll("\\(\\s+", "(");
	}
	
	public static String removeTrailingParenthesisSpaces(String statement) {
		return statement.replaceAll("\\s+\\)", ")");
	}
	
	public static StatementType getStatementType(String statement) {
		String stmt = parseStatement(statement);
		if(stmt.matches("^\\s*select")) {
			return StatementType.SELECT;
		}else if(stmt.matches("^\\s*insert")){
			return StatementType.INSERT;
		}else if(stmt.matches("^\\s*update")) {
			return StatementType.UPDATE;
		}else if(stmt.matches("^\\s*delete")) {
			return StatementType.DELETE;
		}else if(stmt.matches("^\\s*alter")) {
			return StatementType.ALTER;
		}else {
			throw new IllegalArgumentException();
		}
	}
}
