package pl.mobigen.interviewAlgorithms;

/**
 * Write a function that will return n-th entry in the fibonacci series.
 * Sample series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 * Examples:
 * fib(4) -> 3
 */
public class Fibonacci {
	
	public static int fib(int n) {
		
		if (n < 2) {
			return n;
		}
		
		return fib(n - 1) + fib(n - 2);
	}

}
