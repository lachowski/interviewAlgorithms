package pl.mobigen.interviewAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Create queue data structure. It should provide method: add(), remove() and peek(). (peek return the last element but not removes it)
 * Queue will operate on integers to simplifying stuff. 
 *
 * Examples:
 * Queue queue = new Queue();
 * queue.add(1);	adds to beginning
 * queue.add(2);
 * queue.peek(); -> 1
 * queue.remove(); -> return removed head of the queue -> 1, removes from the end
 * queue.peek(); -> null
 *
 */
public class Queue {
	
	// what is being used for storing data is not that important in this exercise. Designing queue API is important.
	LinkedList<Integer> dataStorage = new LinkedList<>();
	
	public void add(Integer element) {
		dataStorage.addFirst(element);
	}
	
	public Integer remove() {
		if (dataStorage.size() == 0) {
			return null;
		}
		return dataStorage.removeLast();
	}
	
	public Integer peek() {
		if (dataStorage.size() == 0) {
			return null;
		}
		return dataStorage.getLast();
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
	}

}
