package com.sunbeam;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Practice01 {
    // 1.Define database conection constants
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	public static final String DB_URl = "jdbc:mysql://localhost:3306/testdb"; 
	public static final String DB_USER = "root";
	public static final String DB_PASSWORD = "manager";
	
    // 2. Static block to load the JDBC Driver once when the class is loaded
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1); //  exit if driver failed to load
		}
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Connection con = null;//  need to import java.sql.Connection;
	try {
		
		//3. Establish the connetion 
		con = DriverManager.getConnection(DB_URl, DB_USER, DB_PASSWORD);
		
		 //4.Disable the autocommit to manage the transaction manualy 
		con.setAutoCommit(false);
		
		//5.Take user inut for the transation
		System.out.print("Enter the amount to be transfered : ");
		double ammount = sc.nextDouble();
		
		System.out.println("Enter the sourceId :");
		int id1 = sc.nextInt();
		
		System.out.println("Enter the destinationId : ");
		int id2 = sc.nextInt();
		
		//6.Prepare first query :Deduct money from source account
		String sql1 = "Update accounts SET balance = balance-? Where id = ?";
		PreparedStatement stmt1 = con.prepareStatement(sql1);
		stmt1.setDouble(1, ammount);
		stmt1.setInt(2, id1);
		int count1 = stmt1.executeUpdate(); //return 1 if successful, 0 if ID not found
		
		//7.Prepare second query : Deduct money to destination account 
		String sql2 = "UPDATE accounts SET balance = balance +? Where id = ? ";
		PreparedStatement stmt2 = con.prepareStatement(sql2);
		stmt2.setDouble(1, ammount);
		stmt2.setInt(2, id2);
		int count = stmt2.executeUpdate(); // return 1 if successful
		
		//8.Logic check : Ensure both  rows were updated
	    // If one ID is Wrong, count will be 0, and we must fail  the whole process
		if(count !=1 || count != 1) {
			throw new RuntimeException("Transation Failed : Invalid Account IDs ");
		}
		else {
			System.out.println("transaction Successful");
		}
		
		//9.If no Error  occured, commit the changes to the database
		con.commit();
	
	}
	catch(Exception e ) {
		
		//10. If ANY error occurs, print it and UNDO all changes ( Rollback)
		e.printStackTrace();
		try {
			if(con !=null) {
				System.out.println("Rolling Back changes ...");
				con.rollback();
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	finally {
		
		//11.Cleanup : Close the connection and scanner to release resources
		try {
			if(con != null) 
				con.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

