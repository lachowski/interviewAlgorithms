package pl.mobigen.interviewAlgorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class LinkedListTest {
	
	@Test
	public void shouldCreateNodeWithNoNextNode() {
		// given
		String data = "test";
		
		// when
		Node node = new Node(data);
		
		// then
		assertEquals(data, node.getData());
		assertNull(node.getNext());
	}
	
	@Test
	public void shouldCreateNodeWithNextNode() {
		// given
		String data1 = "test1";
		String data2 = "test2";
		Node next = new Node(data2);
		
		// when
		Node node = new Node(data1, next);
		
		// then
		assertEquals(data1, node.getData());
		assertEquals(next, node.getNext());
		assertEquals(data2, node.getNext().getData());
	}
	
	@Test
	public void shouldCreateEmptyLinkedList() {
		// when
		LinkedList linkedList = new LinkedList();
		
		// then
		assertNull(linkedList.getFirst());
	}
	
	@Test
	public void shouldInsertFirstElement() {
		// given
		LinkedList linkedList = new LinkedList();
		String data = "data";
		
		// when
		linkedList.insertFirst(data);
		
		// then
		assertEquals(data, linkedList.getFirst().getData());
	}
	
	@Test
	public void shouldInsertFirstAndModeExistingNodes() {
		// given
		LinkedList linkedList = new LinkedList();
		String data1 = "data1";
		String data2 = "data2";
		linkedList.insertFirst(data1);
		
		// when
		linkedList.insertFirst(data2);
		
		// then
		assertEquals(data2, linkedList.getFirst().getData());
		assertEquals(data1, linkedList.getFirst().getNext().getData());
	}
	
	@Test
	public void shouldReturnLinkedListSize() {
		// given
		LinkedList linkedList = new LinkedList();
		linkedList.insertFirst("data1");
		linkedList.insertFirst("data2");
		linkedList.insertFirst("data3");
		
		// when
		int size = linkedList.size();
		
		// then
		assertEquals(3, size);
	}
	
	@Test
	public void shouldReturnLastElement() {
		// given
		LinkedList linkedList = new LinkedList();
		linkedList.insertFirst("data1");
		linkedList.insertFirst("data2");
		linkedList.insertFirst("data3");
		
		// when
		Node last = linkedList.getLast();
		
		// then
		assertEquals("data1", last.getData());
	}
	
	@Test
	public void shouldClearLinkedListFromNodes() {
		// given
		LinkedList linkedList = new LinkedList();
		linkedList.insertFirst("data");
		linkedList.insertFirst("data");
		linkedList.insertFirst("data");
		
		// when
		linkedList.clear();
		
		// then
		assertEquals(0, linkedList.size());
	}
	
	@Test
	public void shouldRemoveFirstElement() {
		// given
		LinkedList linkedList = new LinkedList();
		String data1 = "data1";
		String data2 = "data2";
		String data3 = "data3";
		linkedList.insertFirst(data1);
		linkedList.insertFirst(data2);
		linkedList.insertFirst(data3);
		
		// when
		linkedList.removeFirst();
		
		// then
		assertEquals(2, linkedList.size());
		assertEquals(data2, linkedList.getFirst().getData());
	}
	
	@Test
	public void shouldRemoveLastElement() {
		// given
		LinkedList linkedList = new LinkedList();
		String data1 = "data1";
		String data2 = "data2";
		String data3 = "data3";
		linkedList.insertFirst(data1);
		linkedList.insertFirst(data2);
		linkedList.insertFirst(data3);
		
		// when
		linkedList.removeLast();
		
		// then
		assertEquals(2, linkedList.size());
		assertEquals(data3, linkedList.getFirst().getData());
		assertEquals(data2, linkedList.getLast().getData());
	}
	
	@Test
	public void shouldInsertLast() {
		// given
		LinkedList linkedList = new LinkedList();
		String data1 = "data1";
		String data2 = "data2";
		String data3 = "data3";
		String data4 = "data4";
		linkedList.insertFirst(data1);
		linkedList.insertFirst(data2);
		linkedList.insertFirst(data3);
		
		// when
		linkedList.insertLast(data4);
		
		// then
		assertEquals(data4, linkedList.getLast().getData());
	}
	
	@Test
	public void shouldGetNthElement() {
		// given
		LinkedList linkedList = new LinkedList();
		String data1 = "data1";
		String data2 = "data2";
		String data3 = "data3";
		linkedList.insertFirst(data1);
		linkedList.insertFirst(data2);
		linkedList.insertFirst(data3);
		
		// when
		Node first = linkedList.getAt(0);
		Node last = linkedList.getAt(linkedList.size() - 1);
		
		// then
		assertEquals(first.getData(), linkedList.getFirst().getData());
		assertEquals(last.getData(), linkedList.getLast().getData());
	}
	
	@Test
	public void shouldRemoveNthElement() {
		// given
		LinkedList linkedList = new LinkedList();
		String data1 = "data1";
		String data2 = "data2";
		String data3 = "data3";
		linkedList.insertFirst(data1);
		linkedList.insertFirst(data2);
		linkedList.insertFirst(data3);
		
		// when
		linkedList.removeAt(1);
		
		// then
		assertEquals(data3, linkedList.getFirst().getData());
		assertEquals(data1, linkedList.getLast().getData());
		assertEquals(2, linkedList.size());
	}
	
	@Test
	public void shouldInsertNthElement() {
		// given
		LinkedList linkedList = new LinkedList();
		String data1 = "data1";
		String data2 = "data2";
		String data3 = "data3";
		String data4 = "data4";
		linkedList.insertFirst(data1);
		linkedList.insertFirst(data2);
		linkedList.insertFirst(data3);
		
		// when
		linkedList.insertAt(1, data4);
		
		// then
		assertEquals(data3, linkedList.getFirst().getData());
		assertEquals(data4, linkedList.getAt(1).getData());
		assertEquals(data2, linkedList.getAt(2).getData());
		assertEquals(4, linkedList.size());
	}

}
