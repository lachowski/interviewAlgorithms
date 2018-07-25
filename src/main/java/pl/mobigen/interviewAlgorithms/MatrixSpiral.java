package pl.mobigen.interviewAlgorithms;

/**
 * Write a function that returns NxN spiral matrix based od provided number
 *
 * Examples:
 * matrix(2)
 * [[1, 2],
 *  [4, 3]]
 * matrix(3)
 * [[1, 2, 3],
 *  [8, 9, 4],
 *  [7, 6 ,5]]
 * matrix(4)
 * [[1,   2,  3, 4],
 *  [12, 13, 14, 5],
 *  [11, 16, 15, 6],
 *  [10,  9,  8, 7]]
 */
public class MatrixSpiral {
	
	public static int[][] matrix(int n) {
		int[][] matrix = new int[n][];
		
		// initialize array with 0 values
		for (int i = 0; i < n; i++) {
			matrix[i] = new int[n];
		}
		
		int startRow = 0;
		int endRow = n - 1;
		int startColumn = 0;
		int endColumn = n - 1;

		int counter = 1;
		
		while (startRow <= endRow && startColumn <= endColumn) {
			
			// top side
			for (int i = startColumn; i <= endColumn; i++) {
				matrix[startRow][i] = counter++;
			}
			startRow++;
			
			// right side
			for (int i = startRow; i <= endRow; i++) {
				matrix[i][endColumn] = counter++;
			}
			endColumn--;
			
			// bottom side
			for (int i = endColumn; i >= startColumn; i--) {
				matrix[endRow][i] = counter++;
			}
			endRow--;
			
			// left side
			for (int i = endRow; i >= startRow; i--) {
				matrix[i][startColumn] = counter++;
			}
			startColumn++;
		}
		
		return matrix;
	}
	
}
