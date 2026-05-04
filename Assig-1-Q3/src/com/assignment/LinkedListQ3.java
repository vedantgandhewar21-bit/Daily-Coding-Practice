package com.assignment;
/*In singly linear linked list implement following operations.
i. insert a new node after a given node(data)
ii. insert a new node before a given node(data)*/


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListQ3 {
    Node head;

    public void insertAfter(int target, int newData) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                Node newNode = new Node(newData);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    public void insertBefore(int target, int newData) {
        if (head == null) return;
        if (head.data == target) {
            Node newNode = new Node(newData);
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == target) {
                Node newNode = new Node(newData);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }
}


