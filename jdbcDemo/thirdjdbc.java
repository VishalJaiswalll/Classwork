package com.example;
import java.sql.*;
public class thirdjdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/acpjava","root","Root");
		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from customer");
		int salary;
		String name,design,dept,id;
		System.out.println("Customer details");
		System.out.println("=========");
		while(rs.next())
		{
			id=rs.getString(1);
			name=rs.getString(2);
			design=rs.getString(3);
			dept=rs.getString(4);
			salary=rs.getInt(5);
			System.out.println(id+"|"+name+"|"+design+"|"+dept+"|"+salary);
					
					
		}
		con.close();
	}

}
