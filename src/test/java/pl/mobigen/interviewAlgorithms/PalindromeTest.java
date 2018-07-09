package pl.mobigen.interviewAlgorithms;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {
	
	@Test
	public void shouldAcceptAsPalindrome() {
		// given
		String testString = "abba";
		
		// when
		boolean result = Palindrome.isPalindrome(testString);
		
		// then
		assertTrue(result);
	}
	
	@Test
	public void shouldAcceptAsPalindromeLongStringWithSpaces() {
		// given
		String testString = "step on no pets";
		
		// when
		boolean result = Palindrome.isPalindrome(testString);
		
		// then
		assertTrue(result);
	}
	
	@Test
	public void shouldNotAcceptAsPalindrome() {
		// given
		String testString = "abc";
		
		// when
		boolean result = Palindrome.isPalindrome(testString);
		
		// then
		assertFalse(result);
	}
}
