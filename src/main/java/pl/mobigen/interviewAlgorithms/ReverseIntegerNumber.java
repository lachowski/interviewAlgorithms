package pl.mobigen.interviewAlgorithms;

/**
 * Return provided number in reverse order.
 *
 * Examples:
 * reverse(123) -> 321
 * reverse(100) -> 1
 * reverse(-123) -> -321
 * reverse(-100) -> -1
 *
 */
public class ReverseIntegerNumber {
	
	public static int reverse(int number) {
		// convert to string
		int nPositive = Math.abs(number);
		String nStr = String.valueOf(nPositive);
		
		// reverse string
		String nReversed = "";
		for (int i = 0; i < nStr.length(); i++) {
			nReversed = nStr.charAt(i) + nReversed;
		}
		
		// keep negative sign
		if (number < 0) {
			number = Integer.valueOf(nReversed) * -1;
		} else {
			number = Integer.valueOf(nReversed);
		}
		
		return number;
	}

}
