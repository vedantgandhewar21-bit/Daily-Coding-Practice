package com.assignment;

public class tester {
    public static void main(String[] args) {
    	CircularLinkedList list = new CircularLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtEnd(30);
        list.display();
        
        list.deleteAtBeginning();
        list.display();
    }
}

