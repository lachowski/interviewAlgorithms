package pl.mobigen.interviewAlgorithms;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramsTest {
	
	@Test
	public void shouldFindAnagram() {
		// given
		String stringA = "rail safety";
		String stringB = "fairy tales";
		
		// when
		boolean result = Anagrams.anagrams(stringA, stringB);
		
		// then
		assertTrue(result);
	}
	
	@Test
	public void shouldReturnTrueWhenNoAnagramFound() {
		// given
		String stringA = "abc";
		String stringB = "abcd";
		
		// when
		boolean result = Anagrams.anagrams(stringA, stringB);
		
		// then
		assertFalse(result);
	}
	 
	@Test
	public void shouldFindAnagramWithSpecialLettersAndUpperCases() {
			// given
		String stringA = "School! MASTER! = ";
		String stringB = "The classroom";
		
		// when
		boolean result = Anagrams.anagrams(stringA, stringB);
		
		// then
		assertTrue(result);
	}
	
	
}
