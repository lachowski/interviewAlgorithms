package pl.mobigen.interviewAlgorithms;

import java.util.LinkedList;

/**
 * Create stack data structure. It should provide method: push(), pop() and peek(). (peek return the last element but not removes it)
 * stack will operate on integers to simplifying stuff. 
 * 
 * Stack: element is added on 'top' of previous one, LIFO
 *
 * Examples:
 * Stack stack = new Stack();
 * stack.push(1);
 * stack.push(2);
 * stack.pop(); -> returns 2
 * stack.pop(); -> returns 1
 * stack.peek(); -> null
 *
 */
public class Stack {
	
	LinkedList<Integer> dataStorage = new LinkedList<>();
	
	public void push(Integer element) {
		dataStorage.addLast(element);
	}
	
	public Integer pop() {
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

}
