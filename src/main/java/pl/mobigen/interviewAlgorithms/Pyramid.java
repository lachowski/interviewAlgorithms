package pl.mobigen.interviewAlgorithms;

/**
 * Write function that will print pyramid, based on provided number of levels.
 * Each level should have the same number of characters, fill left and right side of the level with spaces if necessary.
 *
 * Examples:
 * pyramid(1)
 * "#"
 * pyramid(2)
 * " # "
 * "###"
 * pyramid(3)
 * "  #  "
 * " ### "
 * "#####"
 */
public class Pyramid {
	
	public static String[] pyramid(int n) {
		int lineLength = 2 * n - 1;
		String[] pyramid = new String[n];
		
		for (int i = n - 1; i >= 0; i--) {
			String line = "";
			for(int j = 0; j < lineLength; j++) {
				if (j < i || j > lineLength - 1 - i) {
					line += " ";
				} else {
					line += "#";
				}
			}
			pyramid[n - 1 - i] = line;
		}
		return pyramid;
	}
	
}
