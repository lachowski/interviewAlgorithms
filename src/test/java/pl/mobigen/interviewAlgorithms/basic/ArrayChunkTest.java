package pl.mobigen.interviewAlgorithms.basic;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import pl.mobigen.interviewAlgorithms.basic.ArrayChunk;

public class ArrayChunkTest {

	 @Test
	 public void shouldDivideIntoEqualArrays() {
		// given
		int chunkSize = 2;
		int[] testArray = {1, 2, 3, 4};
		Integer[][] expected = {{1, 2}, {3, 4}};
		
		// when
		Integer[][] result = ArrayChunk.chunk(testArray, chunkSize);
		
		// then
		assertArrayEquals(expected, result);
	 }
	 
	 @Test
	 public void shouldDivideIntoUnequalArrays() {
		// given
		int chunkSize = 3;
		int[] testArray = {1, 2, 3, 4};
		Integer[][] expected = {{1, 2, 3}, {4}};
		
		// when
		Integer[][] result = ArrayChunk.chunk(testArray, chunkSize);
		
		// then
		assertArrayEquals(expected, result);
	 }
	 
	 @Test
	 public void shouldDivideIntoArrayNotFullyFilled() {
		// given
		int chunkSize = 5;
		int[] testArray = {1, 2, 3, 4};
		Integer[][] expected = {{1, 2, 3, 4}};
		
		// when
		Integer[][] result = ArrayChunk.chunk(testArray, chunkSize);
		
		// then
		assertArrayEquals(expected, result);
	 }
}
