package com.assignment;

public class Tester {
public static void main(String[] args) {
	LinkedlistQ2 list = new LinkedlistQ2();
	
	list .addFirst(40);
	list .addFirst(30);
	list .addFirst(20);
	list .addFirst(10);
	list .addFirst(5);
	
	
	int keyToFind= 30;
	
	if(list.search(keyToFind)) {
		System.out.println("Key "+keyToFind+" Found");
	}
	else {
		System.out.println("Key "+keyToFind+" Not Found");
	}
	//sample 
	int key2= 100;
	if(list.search(key2)) {
		System.out.println("Key "+key2+" Found");
	}
	else {
		System.out.println("Key "+key2+" Not Found");
	}
}
}
