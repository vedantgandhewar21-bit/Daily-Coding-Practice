package com.Assignment;

public class CountWordsInString {
public static void main(String[] args) {
	String str= " Hello! Good Morning";
	
	if(str.trim().isEmpty()) {
		System.out.println("String is Empty Word Count = 0");
	}
	else {
		String[] words = str.trim().split("\\s+");
		System.out.println("Word Count = "+words.length);
	}
}
}
