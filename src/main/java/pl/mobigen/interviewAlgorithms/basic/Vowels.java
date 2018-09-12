package pl.mobigen.interviewAlgorithms.basic;

/**
 * Write a function that will return number of vowels in provided string
 * vowels: a, e, i, o ,u
 *
 * Examples:
 * vowels("Cat") -> 1
 * vowels("Abracadabra") -> 5
 *
 */
public class Vowels {
	
	public static int vowels(String str) {
		String vowels = "aeiou";
				
		int vowelsCounter = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			int vowelIndex = vowels.indexOf(str.charAt(i));
			if (vowelIndex != -1) {
				vowelsCounter++;
			}
		}
		return vowelsCounter;
	}

}
