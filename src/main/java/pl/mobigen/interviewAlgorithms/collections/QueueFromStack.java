package pl.mobigen.interviewAlgorithms.collections;

/**
 * Implement queue data structure that internally keeps data inside two stacks.
 * Use only add, remove and peek methods provided by the queue. Do not use internal array.
 *
 * Examples:
 * Queue q = new Queue();
 * q.add(1);
 * q.add(2);
 * q.peek(); -> 1
 * q.remove(); -> 1
 * q.remove(); -> 2
 */
public class QueueFromStack {
	
	Stack stackOne = new Stack();
	Stack stackTwo = new Stack();
	
	public void add(Integer element) {
		stackOne.push(element);
	}
	
	public Integer remove() {
		while (stackOne.peek() != null) {
			stackTwo.push(stackOne.pop());
		}
		Integer value = stackTwo.pop();
		while (stackTwo.peek() != null) {
			stackOne.push(stackTwo.pop());
		}
		return value;
	}
	
	public Integer peek() {
		while (stackOne.peek() != null) {
			stackTwo.push(stackOne.pop());
		}
		Integer value = stackTwo.peek();
		while (stackTwo.peek() != null) {
			stackOne.push(stackTwo.pop());
		}
		return value;
	}

}
