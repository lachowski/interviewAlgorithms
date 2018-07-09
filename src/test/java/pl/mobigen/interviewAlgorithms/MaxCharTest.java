package pl.mobigen.interviewAlgorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxCharTest {
	
	@Test
	public void shouldFindMostlyUsedCharacterInShortString() {
		// given
		String testString = "Hello";
		String expected = "l";
		
		// when
		String result = MaxChar.findMaxChar(testString);
		
		// then
		assertEquals(expected, result);
	}
	
	@Test
	public void shouldFindMostlyUsedCharacterInStringWithSpaces() {
		// given
		String testString = "Hello 123456789000 ";
		String expected = "0";
		
		// when
		String result = MaxChar.findMaxChar(testString);
		
		// then
		assertEquals(expected, result);
	}
	
	@Test
	public void shouldFindMostlyUsedCharacterInOneLetterString() {
		// given
		String testString = "a";
		String expected = "a";
		
		// when
		String result = MaxChar.findMaxChar(testString);
		
		// then
		assertEquals(expected, result);
	}

}
