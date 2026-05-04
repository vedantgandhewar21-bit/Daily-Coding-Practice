package com.assignment;
public class tester {
    public static void main(String[] args) {
        LinkedListQ4 list = new LinkedListQ4();

        list.insertSorted(30);
        list.insertSorted(10);
        list.insertSorted(20);
        list.insertSorted(5);
        list.insertSorted(25);

        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}