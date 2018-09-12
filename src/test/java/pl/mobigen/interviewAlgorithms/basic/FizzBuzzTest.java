package pl.mobigen.interviewAlgorithms.basic;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import pl.mobigen.interviewAlgorithms.basic.FizzBuzz;

public class FizzBuzzTest {

		@Test
		public void shouldReturnArrayWithFizzAndBuzz() {
			// given
			int number = 5;
			String[] expected = {"1", "2", "fizz", "4", "buzz"};
			
			// when
			String[] result = FizzBuzz.fizzBuzz(number);
			
			// then
			assertArrayEquals(expected, result);
		}
		
		@Test
		public void shouldReturnArrayWithoutFizzAndBuzz() {
			// given
			int number = 2;
			String[] expected = {"1", "2"};
			
			// when
			String[] result = FizzBuzz.fizzBuzz(number);
			
			// then
			assertArrayEquals(expected, result);
		}
		
		@Test
		public void shouldReturnArrayWithFizzbuzz() {
			// given
			int number = 15;
			String[] expected = {"1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz"};
			
			// when
			String[] result = FizzBuzz.fizzBuzz(number);
			
			// then
			assertArrayEquals(expected, result);
		}
}
