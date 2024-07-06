package com.example;

import java.sql.*;

public class Firstjdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/acpjava","root","Root");
		
		Statement stmt=con.createStatement();
		// step 4 Execute Statement
		int a=stmt.executeUpdate("insert into emp value(1,'Vishal','Mechanical','100000')");
		
		System.out.println("Successfully added employee"+a);
		
        int b=stmt.executeUpdate("insert into emp value(2,'Vikram','Electrical','50000')");
		
		System.out.println("Successfully added employee"+b);
		
		
	    //step 5
		con.close();
		
				
	}

}
