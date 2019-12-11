package com.bridgelabz.loginregistrationOne.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bridgelabz.loginregistrationOne.model.PersonDetails;
import com.bridgelabz.loginregistrationOne.utility.Utility;

public class InsertQuery {
	Connection con = null;
	PreparedStatement pstmt = null;
	String user = "root";
	String password = "root";

	public String registeredUser(PersonDetails person) {

		String FirstName = person.getFirstName();
		String LastName = person.getLastname();
		String Emailid = person.getEmailId();
		String UserId = person.getUserName();
		String Password = person.getPassword();
		String PhoneNo = person.getPhoneNumber();
		String ConfirmPassword = person.getConformPassword();

		String query = "insert into login.Registation value(?,?,?,?,?,?,?)";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class loaded & Registered");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", user, password);
			System.out.println("Connection Established with Databasde");
			pstmt = con.prepareStatement(query);
			System.out.println("Plateform Created");

			pstmt.setString(1, FirstName);
			pstmt.setString(2, LastName);
			pstmt.setString(3, Emailid);
			pstmt.setString(4, UserId);
			pstmt.setString(5, Password);
			pstmt.setString(6, PhoneNo);
			pstmt.setString(7, ConfirmPassword);

			int i = pstmt.executeUpdate();
			if (i != 0) {
				return "SUCCESS";
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return "Sorry Something Went Wrong";
	}
}