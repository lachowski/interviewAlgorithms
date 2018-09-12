package pl.mobigen.interviewAlgorithms.collections;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pl.mobigen.interviewAlgorithms.collections.Stack;

public class StackTest {
	
	@Test
	public void shouldCreateQueue() {
		// given
		Stack stack = new Stack();
		
		// when
		stack.push(1);
		stack.push(2);
			
		// then
		assertEquals(2, stack.pop().intValue());
		assertEquals(1, stack.pop().intValue());
		assertEquals(null, stack.peek());
	}
	
}
