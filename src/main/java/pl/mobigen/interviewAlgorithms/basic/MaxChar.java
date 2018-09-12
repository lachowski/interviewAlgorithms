package pl.mobigen.interviewAlgorithms.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * In a given string find character that is most commonly used.
 *
 * Examples:
 * findMaxChar("Hello") -> "l"
 * findMaxChar("Hello 123456789000") -> "0"
 * findMaxChar("a") -> "a"
 *
 */
public class MaxChar {
	
	public static String findMaxChar(String string) {
		Map<Character, Integer> charMap = new HashMap<>();
		// create map with number of occurrences
		for (int i = 0; i < string.length(); i++) {
			Character charAt = string.charAt(i);
			if (charMap.containsKey(charAt)) {
				charMap.put(charAt, charMap.get(charAt) + 1);
			} else {
				charMap.put(charAt, 1);
			}
		}
		
		// choose max
		int max = 0;
		Character charMax = null;
		for (Character key : charMap.keySet()) {
			if (charMap.get(key) > max) {
				max = charMap.get(key);
				charMax = key;
			}
		}
		
		return Character.toString(charMax);
	}

}
