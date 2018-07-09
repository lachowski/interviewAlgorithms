package pl.mobigen.interviewAlgorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void shouldReverseSimpleText() {
		// given
		String testString = "Hello!";
		String expected = "!olleH";
		
		// when
		String result = ReverseString.reverse(testString);
		
		// then
		assertEquals(expected, result);
	}
	
	@Test
	public void shouldReverseTextWithLeadingWhitespaces() {
		// given
		String testString = "  Hello!";
		String expected = "!olleH  ";
		
		// when
		String result = ReverseString.reverse(testString);
		
		// then
		assertEquals(expected, result);
	}
	
	@Test
	public void shouldReverseOneLetterText() {
		// given
		String testString = "X";
		String expected = "X";
		
		// when
		String result = ReverseString.reverse(testString);
		
		// then
		assertEquals(expected, result);
	}
}
