package pl.mobigen.interviewAlgorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WaveQueuesTest {
	
	@Test
	public void shouldWaveTwoEqualSizeQueues() {
		// given
		Queue q1 = new Queue();
		q1.add(1);
		q1.add(2);
		Queue q2 = new Queue();
		q2.add(11);
		q2.add(22);
		
		// when
		Queue result = WaveQueues.wave(q1, q2);
		
		// then
		assertEquals(1, result.remove().intValue());
		assertEquals(11, result.remove().intValue());
		assertEquals(2, result.remove().intValue());
		assertEquals(22, result.remove().intValue());
		assertEquals(null, result.remove());
	}
	
	@Test
	public void shouldWaveTwoDifferentSizeQueues() {
		// given
		Queue q1 = new Queue();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		Queue q2 = new Queue();
		q2.add(11);
		q2.add(22);
		
		// when
		Queue result = WaveQueues.wave(q1, q2);
		
		// then
		assertEquals(1, result.remove().intValue());
		assertEquals(11, result.remove().intValue());
		assertEquals(2, result.remove().intValue());
		assertEquals(22, result.remove().intValue());
		assertEquals(3, result.remove().intValue());
		assertEquals(4, result.remove().intValue());
		assertEquals(null, result.remove());
	}
	
}
