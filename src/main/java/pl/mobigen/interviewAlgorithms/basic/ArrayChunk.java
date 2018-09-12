package pl.mobigen.interviewAlgorithms.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * Divide array into smaller sub arrays, each with length equal to provided chunk size value.
 *
 * Examples:
 * chunk({1, 2, 3, 4}, 2) -> {{1, 2}, {3, 4}}
 * chunk({1, 2, 3, 4}, 3) -> {{1, 2, 3}, {4}}
 * chunk({1, 2, 3, 4}, 5) -> {{1, 2, 3, 4}}
 */
public class ArrayChunk {

	public static Integer[][] chunk(int[] array, int size) {
		List<Integer> chunkList = new ArrayList<>();
		List<Integer[]> resultList = new ArrayList<>();
		
		for (int i = 0; i < array.length; i++) {
			chunkList.add(array[i]);
			if ((i + 1) % size == 0 || i == (array.length - 1)) {
				Integer[] chunkArray = chunkList.toArray(new Integer[0]);
				resultList.add(chunkArray);
				chunkList = new ArrayList<>();
			}
		}
		
		return resultList.toArray(new Integer[0][]); 
	}
	
}
