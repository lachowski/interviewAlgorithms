package pl.mobigen.interviewAlgorithms;

/**
 * Write function that should print steps, based on provided number of steps.
 * Each level should have the same number of characters, steps < n should be filled with spaces.
 *
 * Examples:
 * steps(2)
 * "# "
 * "##"
 * steps(4)
 * "#   "
 * "##  "
 * "### "
 * "####"
 */
public class Steps {
	
	public static String[] steps(int n) {
		String[] stp = new String[n];
		for (int i = 0; i < n; i++) {
			String line = "";		// TIP: concatenate on temp. string and not on an array entry
			for (int j = 0; j < n; j++) {
				if (j <= i) {
					line += "#";
				} else {
					line += " ";
				}
			}
			stp[i] = line;
		}
		return stp;
	}
	
	public static void main(String[] args) {
		steps(1);
	}

}
