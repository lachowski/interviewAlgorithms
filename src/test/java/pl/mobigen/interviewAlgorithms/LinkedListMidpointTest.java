package pl.mobigen.interviewAlgorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListMidpointTest {
	
	@Test
	public void shouldFindMidpointInEvenSizedLinkedList() {
		// given
		LinkedList linkedList = new LinkedList();
		String data1 = "data1";
		String data2 = "data2";
		String data3 = "data3";
		String data4 = "data4";
		linkedList.insertFirst(data1);
		linkedList.insertFirst(data2);
		linkedList.insertFirst(data3);
		linkedList.insertFirst(data4);
		
		// when
		Node middlepoint = LinkedListMidpoint.midpoint(linkedList);
		
		// then
		assertEquals(data3, middlepoint.getData());
	}
	
	@Test
	public void shouldFindMidpointInOddSizedLinkedList() {
		// given
		LinkedList linkedList = new LinkedList();
		String data1 = "data1";
		String data2 = "data2";
		String data3 = "data3";
		String data4 = "data4";
		String data5 = "data5";
		linkedList.insertFirst(data1);
		linkedList.insertFirst(data2);
		linkedList.insertFirst(data3);
		linkedList.insertFirst(data4);
		linkedList.insertFirst(data5);
		
		// when
		Node middlepoint = LinkedListMidpoint.midpoint(linkedList);
		
		// then
		assertEquals(data3, middlepoint.getData());
	}

}
