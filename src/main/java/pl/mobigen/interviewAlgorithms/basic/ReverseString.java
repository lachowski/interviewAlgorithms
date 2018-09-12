package pl.mobigen.interviewAlgorithms.basic;

/**
 * Return provided string in reverse order.
 *
 * Examples:
 * reverse("Hello!") -> "!olleH"
 * reverse("  Hello") -> "olleH  "
 * reverse("H") -> "H"
 *
 */
public class ReverseString {

	public static String reverse(String string) {
		String reversed = "";
		for (int i = 0; i < string.length(); i++) {
			reversed = string.charAt(i) + reversed;
		}
		return reversed;
	}

}
