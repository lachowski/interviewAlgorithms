package pl.mobigen.interviewAlgorithms;

/**
 * Write function that will capitalize first letter of every word in provided string.
 *
 * Examples:
 * Capitalize("I am the java master") -> "I Am The Java Master"
 *
 */
public class Capitalize {
	
	public static String capitalize(String str) {
		String[] splited = str.split(" ");
		String result = "";
		for (String word : splited) {
			result = result + Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		return result.trim();
	}

}
