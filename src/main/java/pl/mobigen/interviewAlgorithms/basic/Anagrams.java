package pl.mobigen.interviewAlgorithms.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * Check if provided strings are anagrams of eachother.
 * Anagram: if string uses the same characters in the same quantity as second string.
 * Check only letters, case insensitive.
 *
 * Examples:
 * anagrams("Hi there") -> "Bye there" -> false
 * anagrams("School! MASTER! = ") -> "The classroom" -> true
 *
 */
public class Anagrams {
	
	public static boolean anagrams(String stringA, String stringB) {
		
		Map<Character, Integer> stringACharMap = buildCharMap(stringA);
		Map<Character, Integer> stringBCharMap = buildCharMap(stringB);
		
		if (stringACharMap.size() != stringBCharMap.size()) {
			return false;
		}
		
		for (Character key : stringACharMap.keySet()) {
			if (stringACharMap.get(key) != stringBCharMap.get(key)) {
				return false;
			}
		}
		
		return true;
	}
	
	private static Map<Character, Integer> buildCharMap(String str) {
		// get rid of non letter chars
		str = str.replaceAll("[^\\w]", "").toLowerCase();
		
		Map<Character, Integer> charMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Character character = str.charAt(i);
			if (charMap.containsKey(character)) {
				charMap.put(character, charMap.get(character) + 1);
			} else {
				charMap.put(character, 1);
			}
		}
		return charMap;
	}

}
