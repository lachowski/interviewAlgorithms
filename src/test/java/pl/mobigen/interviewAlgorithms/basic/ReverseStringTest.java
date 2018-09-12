package pl.mobigen.interviewAlgorithms.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pl.mobigen.interviewAlgorithms.basic.ReverseString;

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
		String testString = "H";
		String expected = "H";
		
		// when
		String result = ReverseString.reverse(testString);
		
		// then
		assertEquals(expected, result);
	}
}
