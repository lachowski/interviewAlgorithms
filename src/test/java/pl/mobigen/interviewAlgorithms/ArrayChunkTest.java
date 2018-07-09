package pl.mobigen.interviewAlgorithms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayChunkTest {

	 @Test
	 public void shouldDivideIntoEqualArrays() {
		// given
		int chunkSize = 2;
		int[] testArray = {1, 2, 3, 4};
		int[][] expected = {{1, 2}, {3, 4}};
		
		// when
		int[][] result = ArrayChunk.chunk(testArray, chunkSize);
		
		// then
		assertArrayEquals(expected, result);
	 }
	 
	 @Test
	 public void shouldDivideIntoUnequalArrays() {
		// given
		int chunkSize = 3;
		int[] testArray = {1, 2, 3, 4};
		int[][] expected = {{1, 2, 3}, {4}};
		
		// when
		int[][] result = ArrayChunk.chunk(testArray, chunkSize);
		
		// then
		assertArrayEquals(expected, result);
	 }
	 
	 @Test
	 public void shouldDivideIntoArrayNotFullyFilled() {
		// given
		int chunkSize = 5;
		int[] testArray = {1, 2, 3, 4};
		int[][] expected = {{1, 2, 3, 4}};
		
		// when
		int[][] result = ArrayChunk.chunk(testArray, chunkSize);
		
		// then
		assertArrayEquals(expected, result);
	 }
}
