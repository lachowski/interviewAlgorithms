package pl.mobigen.interviewAlgorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntegerTest {

	@Test
	public void shouldReverseNumber() {
		// given
		int number = 123;
		int expected = 321;
		
		// when
		int result = ReverseIntegerNumber.reverse(number);
		
		// then
		assertEquals(expected, result);
	}
	
	@Test
	public void shouldReverseNumberWithTrailingZeros() {
		// given
		int number = 100;
		int expected = 1;
		
		// when
		int result = ReverseIntegerNumber.reverse(number);
		
		// then
		assertEquals(expected, result);
	}
	
	@Test
	public void shouldReverseNegativeNumber() {
		// given
		int number = -123;
		int expected = -321;
		
		// when
		int result = ReverseIntegerNumber.reverse(number);
		
		// then
		assertEquals(expected, result);
	}
	
	@Test
	public void shouldReverseNegativeNumberWithTrailingZeros() {
		// given
		int number = -100;
		int expected = -1;
		
		// when
		int result = ReverseIntegerNumber.reverse(number);
		
		// then
		assertEquals(expected, result);
	}
}
