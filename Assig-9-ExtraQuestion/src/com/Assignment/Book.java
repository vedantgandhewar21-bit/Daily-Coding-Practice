package com.Assignment;

public class Book {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "ISBN : "+isbn+ "| Author : "+ authorName+ " | Price : "
				+ +price + " | Qty : " +quantity;
		
	}
	}
	

