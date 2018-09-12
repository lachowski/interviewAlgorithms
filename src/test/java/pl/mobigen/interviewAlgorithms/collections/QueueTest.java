package pl.mobigen.interviewAlgorithms.collections;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pl.mobigen.interviewAlgorithms.collections.Queue;

public class QueueTest {
	
	@Test
	public void shouldCreateQueue() {
		// given
		Queue queue = new Queue();
		
		// when
		queue.add(1);
		queue.add(2);
			
		// then
		assertEquals(1, queue.remove().intValue());
		assertEquals(2, queue.remove().intValue());
		assertEquals(null, queue.peek());
	}
	
}
