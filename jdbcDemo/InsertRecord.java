package com.example;
import java.sql.*;
import java.util.Scanner;

public class InsertRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/acpjava","root","Root");
		
		PreparedStatement pstmt=con.prepareStatement("INSERT INTO customer VALUE(?,?,?,?,?)");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id:");
		String id=sc.next();
		
		System.out.println("Enter Employee Name:");
		String name=sc.next();
		
		System.out.println("Enter Employee designation:");
		String desig=sc.next();
		
		System.out.println("Enter Employee department:");
		String dept=sc.next();
		
		System.out.println("Enter Employee salary:");
		int sal=sc.nextInt();
		
		pstmt.setString(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, desig);
		pstmt.setString(4, dept);
		pstmt.setInt(5, sal);
		
		int r=pstmt.executeUpdate();
		con.close();
		System.out.println(r+"Record added successfully!!!");
		
		
		
	}

}
