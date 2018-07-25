package pl.mobigen.interviewAlgorithms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MatrixSpiralTest {
	
	@Test
	public void shouldGenerate2RowsMatrix() {
		// given
		int[][] expected = {{1, 2},
							{4, 3}};
		
		// when
		int[][] result = MatrixSpiral.matrix(2);
		
		// then
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void shouldGenerate3RowsMatrix() {
		// given
		int[][] expected = {{1, 2, 3},
							{8, 9, 4},
							{7, 6, 5}};
		
		// when
		int[][] result = MatrixSpiral.matrix(3);
		
		// then
		assertArrayEquals(expected, result);
	}
	
}
