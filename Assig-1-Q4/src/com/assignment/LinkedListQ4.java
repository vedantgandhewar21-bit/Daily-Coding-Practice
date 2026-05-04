package com.assignment;
//4. Write a function which will insert values in sorted order into linked list.




	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	
	class LinkedListQ4 {
	    Node head;
		
	    
	public void insertSorted(int newData) {
	    Node newNode = new Node(newData);

	    if (head == null || head.data >= newData) {
	        newNode.next = head;
	        head = newNode;
	        return;
	    }

	    Node current = head;
	    while (current.next != null && current.next.data < newData) {
	        current = current.next;
	    }

	    newNode.next = current.next;
	    current.next = newNode;
	}
}
	