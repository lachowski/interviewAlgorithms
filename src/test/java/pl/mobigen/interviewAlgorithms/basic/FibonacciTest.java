package pl.mobigen.interviewAlgorithms.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pl.mobigen.interviewAlgorithms.basic.Fibonacci;

public class FibonacciTest {
	
	@Test
	public void shouldFindFibonacciNthEntry() {
		// given
		int expected = 3;
		
		// when
		int result = Fibonacci.fib(4);
		
		// then
		assertEquals(expected, result);
	}
	
}
