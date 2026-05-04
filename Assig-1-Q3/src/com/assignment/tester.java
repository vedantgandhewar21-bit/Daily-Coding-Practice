package com.assignment;
public class tester {
    public static void main(String[] args) {
        LinkedListQ3 list = new LinkedListQ3();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        list.insertAfter(20, 25);
        list.insertBefore(10, 5);
        list.insertBefore(30, 28);

        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
