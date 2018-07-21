package pl.mobigen.interviewAlgorithms;

/**
 * Return string array containing numbers from 1 to n. When number multiples of three then instead of number return 'fizz',
 * when multiples by five then return 'buzz'. In case when number multiples both by three and five return 'fizzbuzz'.
 *
 * Examples:
 * fizzBuzz(5) -> {"1", "2", "fizz", "4", "buzz"}
 * fizzBuzz(2) -> {"1", "2"}
 * fizzBuzz(15) -> {"1", "2", "fizz", "4", "buzz", "fizz", 7, 8, "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz"}
 *
 */
public class FizzBuzz {
	
	public static String[] fizzBuzz(int number) {
		String[] arr = new String[number]; 		// remember array indexing is from 0

		for (int i = 0; i < number; i++) {
			int numberToCheck = i + 1;
			if (numberToCheck % 3 == 0 && numberToCheck % 5 == 0) {
				arr[i] = "fizzbuzz";
			} else if (numberToCheck % 3 == 0) {
				arr[i] = "fizz";	
			} else if (numberToCheck % 5 == 0) {
				arr[i] = "buzz";
			} else {
				arr[i] = String.valueOf(numberToCheck);
			}
		}
		return arr;
	}

}
