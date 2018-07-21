package pl.mobigen.interviewAlgorithms;

/**
 * Check if string is a palindrome.
 *
 * Examples:
 * isPalindrome("abba") -> true
 * isPalindrome("step on no pets") -> true
 * isPalindrome("abc") -> false
 *
 */
public class Palindrome {
	
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
