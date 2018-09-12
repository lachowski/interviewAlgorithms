package pl.mobigen.interviewAlgorithms.collections;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pl.mobigen.interviewAlgorithms.collections.QueueFromStack;

public class QueueFromStackTest {
	
	@Test
	public void shouldPeekLastElement() {
		// given
		QueueFromStack queue = new QueueFromStack();
		
		// when
		queue.add(1);
		queue.add(2);
		
		// then
		assertEquals(1, queue.peek().intValue());
		assertEquals(1, queue.peek().intValue());
	}
	
	@Test
	public void shouldRemoveLastElement() {
		// given
		QueueFromStack queue = new QueueFromStack();
		
		// when
		queue.add(1);
		queue.add(2);
		
		// then
		assertEquals(1, queue.peek().intValue());
		assertEquals(1, queue.remove().intValue());
		assertEquals(2, queue.peek().intValue());
	}
}
