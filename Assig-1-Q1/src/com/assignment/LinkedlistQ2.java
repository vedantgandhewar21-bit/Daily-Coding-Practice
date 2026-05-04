package com.assignment;
//2. Write a function to search a Node of given key into singly 
  // linked list. (stop search when key is found)

public class LinkedlistQ2 {
	    class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}		
	}
	private Node head;
	public LinkedlistQ2() {
		head =null;
	}
	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next=head;
		head=newnode;
	}
	

public boolean search(int key) {
	Node current = head;
	while (current !=null) { //run till the last node
		if(current.data==key) {//compare the current data with the key 
			return true;
		}
		current=current.next;//check the next element
	
}
	return false;
}
}
