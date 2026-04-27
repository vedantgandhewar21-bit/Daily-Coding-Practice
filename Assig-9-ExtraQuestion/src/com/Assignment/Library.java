package com.Assignment;
import java.util.*;

public class Library {
public static void main(String[] args) {
	ArrayList<Book> booklist = new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	int choice;
	
	do {
		System.out.println("\n ---- Library Menu ----");
		System.out.println("1.Add new Book");
	    System.out.println("2.Dsiplay All Books ( Forward)");  
	    System.out.println("3.Display All Bok (Reverse)");
	    System.out.println("4.Delete Book at Index");
	    System.out.println("5. Sort By Price");
	    System.out.println("0. Exit");
	    System.out.println("Enter your Choice");
	    choice = sc.nextInt();
	    
	    //Switch statement
	     switch(choice) {
	     
	     case 1 : 
	    	 //Add new Book
	    	 System.out.print("Enter Isbn No :");
	    	 String isbn = sc.next();
	
	    	 System.out.print("Enter Price :");
	    	 double price= sc.nextDouble();
	    	 
	    	 sc.nextLine();//string buffer
	    	 
	    	 System.out.print("Enter Author Name :");
	    	 String authorName=sc.nextLine();
	    	 
	    	 System.out.print("Enter Qty :");
	    	 int quantity=sc.nextInt();
	    	 
	    	 booklist.add(new Book(isbn,price,authorName,quantity));
	    	 break;
	    	 
	     case 2:
	    	 //Display All Books
	    	 booklist.forEach(System.out::println);
	         break;
	         
	     case 3:
	    	 // Display All Books in Reverse
	    	 ListIterator<Book> iterator =  booklist.listIterator(booklist.size());
	    	 while (iterator.hasPrevious()) {
	    		 System.out.println(iterator.previous());
	    	 }
	    	 break;
	     
	     case 4:
	    	 //Delete Book at index
	    	 System.out.println(" Enter Index");
	    	 int idx= sc.nextInt();
	    	 if(idx>=0 && idx<booklist.size())
	    		 booklist.remove(idx);
	    	 else System.out.println("Invalid index!");
	    	 break;
	    	 
	     case 5 :
	    	 booklist .sort( Comparator.comparing(Book::getPrice).reversed());
	         System.out.println("Books sorted by price ( descending)");
             break;	     
	     
	     }
	    
	}while(choice!=0);
}
}
	    
	  

