package com.bridgelabz.loginregistrationOne.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
	Connection con = null;
	String user = "root";
	String password = "root";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class loaded & Registered");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", user, password);
		System.out.println("Connection Established with Databasde");
		
	}
	finally {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	return con;
}
}

