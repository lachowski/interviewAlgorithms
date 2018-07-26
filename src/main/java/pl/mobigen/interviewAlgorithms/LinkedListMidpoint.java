package pl.mobigen.interviewAlgorithms;

/**
 * Return middlepoint of link list. If linked list has even number of elements return node that is the at the end of the first half of the list.
 * Do not use counter variable, do not retrieve size of the list. Iterate through the link list only once.
 * 
 * Example:
 * LinkedList[1,2,3,4] -> midpoint is 2
 * LinkedList[1,2,3,4,5] -> midpoint is 3
 */
public class LinkedListMidpoint {
	
	public static Node midpoint(LinkedList linkedList) {
		Node slow = linkedList.getFirst();
		Node fast = linkedList.getFirst();
		
		while (fast.getNext() != null && fast.getNext().getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow;
	}

}
