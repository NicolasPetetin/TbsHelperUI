package helpers;

public class StringHelper {
	public static boolean isBlank(String str) {
		return str == null || str.isEmpty();
	}
	
	public static boolean isNotBlank(String str) {
		return !isBlank(str);
	}
}
