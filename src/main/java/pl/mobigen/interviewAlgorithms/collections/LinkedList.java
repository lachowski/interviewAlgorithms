package pl.mobigen.interviewAlgorithms.collections;

/**
 * Create linked list data structure.
 * 1. Create Node class. Node should have two properties, data and reference to the next node. Design two constructors Node(data) and Node(data, next) 
 * 2. Create LinkedList class. It should have only one property of type Node and named 'head'. New LinkedList is being created with with empty head.
 * 3. Design LinkedList method 'insertFirst(data)'. Look out for situation when head is already set.
 * 4. Design LinkedList method 'size()' which returns number of nodes in LinkedList. 
 * 5. Design LinkedList method 'getFirst()' which returns first node.
 * 6. Design LinkedList method 'getLast()' which returns last node.
 * 7. Design LinkedList method 'clear()' that clears linked list from all nodes.
 * 8. Design LinkedList method 'removeFirst()' that removes head from linked list. If there is more nodes, replace head.
 * 9. Design LinkedList method 'removeLast()' that removes the last element from linked list.
 * 10. Design LinkedList method 'insertLast()' that inserts the last element.
 * 11. Design LinkedList method 'getAt(n)' that returns node at provided index.
 * 12. Design LinkedList method 'removeAt(n)' that removes node at provided index.
 * 13. Design LinkedList method 'insertAt(n)' that inserts node at provided index. if index is out of bound then insert node at the last position.
 * 
 */
public class LinkedList {
	
	private Node head;
	
	// unnecessary
	public LinkedList() {
		head = null;
	}
	
	public void insertFirst(String data) {
		head = new Node(data, head);
	}
	
	public int size() {
		int size = 0;
		Node node = head;
		while (node != null) {
			size++;
			node = node.getNext();
		}
		return size;
	}
	
	public Node getFirst() {
		return head;
	}
	
	public Node getLast() {
		Node last = head;
		if (last == null) {
			return null;
		}
		while (last.getNext() != null) {
			last = last.getNext();
		}
		return last;
	}
	
	public void clear() {
		head = null;
	}
	
	public void removeFirst() {
		if (head != null) {
			head = head.getNext();
		}
	}
	
	public void removeLast() {
		if (head == null) {
			return;
		}
		if (head.getNext() == null) {
			head = null;
			return;
		}
		
		Node node = head.getNext();
		Node previous = head;
		
		while (node.getNext() != null) {
			previous = node;
			node = node.getNext();
			
		}
		
		previous.setNext(null);
	}
	
	public void insertLast(String data) {
		if (head == null) {
			head = new Node(data);
		}
		
		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(new Node(data));
	}
	
	public Node getAt(int n) {
		int count = 0;
		Node node = head;

		while (node != null) {
			if (count == n) {
				return node;
			}
			node = node.getNext();
			count++;
		}
		return null;
	}
	
	public void removeAt(int n) {
		if (head == null) {
			return;
		}
		
		if (n == 0) {
			head = head.getNext();
			return;
		}
		
		int count = 1;
		Node node = head.getNext();
		Node previous = head;
		
		while (node != null) {
			if (count == n) {
				previous.setNext(node.getNext());
				return;
			}
			count++;
			node = node.getNext();
		}
	}
	
	public void insertAt(int n, String data) {
		if (n > size() - 1) {
			return;
		}
		
		if (n == 0) {
			head = new Node(data, head);
			return;
		}
		
		int count = 1;
		Node node = head.getNext();
		Node previous = head;
		
		while (node != null) {
			if (count == n) {
				previous.setNext(new Node(data, node));
				return;
			}
			
			count++;
			previous = node;
			node = node.getNext();
		}
	}

}
