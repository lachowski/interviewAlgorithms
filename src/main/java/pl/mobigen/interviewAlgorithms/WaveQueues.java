package pl.mobigen.interviewAlgorithms;

/**
 * Implement function that can weave two queues into one. 
 * Both input queues can have different lengths and in that case nulls should not be inserted into new queue.
 * Use only add, remove and peek methods provided by the queue.
 *
 * Examples:
 * Queue q1 = new Queue();
 * q1.add(1);
 * q1.add(2);
 * q1.add(3);
 * q1.add(4);
 * Queue q2 = new Queue();
 * q2.add(11);
 * q2.add(22);
 * Queue q3 = weave(q1, q2);
 * q3.remove() -> 1
 * q3.remove() -> 11
 * q3.remove() -> 2
 * q3.remove() -> 22
 * q3.remove() -> 3
 * q3.remove() -> 4
 */
public class WaveQueues {
	
	public static Queue wave(Queue q1, Queue q2) {
		Queue waved = new Queue();
		
		while (q1.peek() != null || q2.peek() != null) {
			if (q1.peek() != null) {
				waved.add(q1.remove());
			}
			if (q2.peek() != null) {
				waved.add(q2.remove());
			}
		}
		return waved;
	}
	
}
