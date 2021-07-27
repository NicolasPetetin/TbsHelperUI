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
			res = addSemiColon(res);
		}
		return res;
	}
	
	public static String addSemiColon(String statement) {
		return statement.trim().endsWith(";") ? statement : statement.concat(";");
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
		if(statement.matches("(?i)^\\s*select.*")) {
			return StatementType.SELECT;
		}else if(statement.matches("(?i)^\\s*(?i)insert.*")){
			return StatementType.INSERT;
		}else if(statement.matches("(?i)^\\s*(?i)update.*")) {
			return StatementType.UPDATE;
		}else if(statement.matches("(?i)^\\s*(?i)delete.*")) {
			return StatementType.DELETE;
		}else if(statement.matches("(?i)^\\s*(?i)alter.*")) {
			return StatementType.ALTER;
		}else {
			throw new IllegalArgumentException();
		}
	}
	
	public static String format(String statement) {
		try {
			StatementType stmtType = getStatementType(statement);
			switch (stmtType) {
			case SELECT:
				return formatSelect(statement);
			case INSERT:
				return formatInsert(statement);
			case UPDATE:
				//TODO return formatUpdate(statement);
			case DELETE:
				//TODO return formatDelete(statement);
			case ALTER:
				//TODO return formatAlter(statement);
			default:
				return statement;
			}
		}catch (IllegalArgumentException e) {
			return statement;
		}
	}

	private static String formatInsert(String statement) {
		String res = statement;
		res = res.replaceAll("(?i)insert", "INSERT");
		res = res.replaceAll("(?i)values", "\nVALUES");
		res = res.replaceAll("(?i)select", "\nSELECT");
		return res;
	}

	private static String formatSelect(String statement) {
		String res = statement;
		res = res.replaceAll("(?i)select", "SELECT");
		res = res.replaceAll("(?i)from", "\nFROM");
		res = res.replaceAll("(?i)left\\s*join", "\nLEFT JOIN");
		res = res.replaceAll("(?i)left\\s*outer\\s*join", "\nLEFT JOIN");
		res = res.replaceAll("(?i)right\\s*join", "\nRIGHT JOIN");
		res = res.replaceAll("(?i)right\\s*outer\\s*join", "\nRIGHT OUTER JOIN");
		res = res.replaceAll("(?i)inner\\s*join", "\nINNER JOIN");
		res = res.replaceAll("(?i)where", "\nWHERE");
		res = res.replaceAll("(?i)order", "\nORDER");
		res = res.replaceAll("(?i)union select", "\nUNION SELECT ");
		return res;
	}
}
