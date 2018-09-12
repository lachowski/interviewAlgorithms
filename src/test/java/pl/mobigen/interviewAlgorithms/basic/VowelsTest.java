package pl.mobigen.interviewAlgorithms.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pl.mobigen.interviewAlgorithms.basic.Vowels;

public class VowelsTest {
	
	@Test
	public void shouldReturnZeroWhenNoVowels() {
		// given
		String word = "ppp";
		int expectedVowels = 0;
		
		// when
		int vowels = Vowels.vowels(word);
		
		// then
		assertEquals(expectedVowels, vowels);
	}
	
	@Test
	public void shouldReturnNumberOfVowels() {
		// given
		String word = "Abracadabra";
		int expectedVowels = 5;
		
		// when
		int vowels = Vowels.vowels(word);
		
		// then
		assertEquals(expectedVowels, vowels);
	}
		
}
