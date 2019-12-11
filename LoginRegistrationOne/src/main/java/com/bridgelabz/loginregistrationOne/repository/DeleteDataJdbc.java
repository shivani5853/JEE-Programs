package com.bridgelabz.loginregistrationOne.repository;

import java.sql.*;

import com.bridgelabz.loginregistrationOne.model.DeleteDetails;

public class DeleteDataJdbc {
	public static String deleteData(DeleteDetails data)
	{
		System.out.println("Coming inside delete method...");
		String UserId=data.getUserid();
		Connection con=null;
		PreparedStatement pstmt=null;
	
		String deleteQuery="delete from login.Registation where UserId=?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(deleteQuery);
			pstmt.setString(1,UserId);
			
			int i=pstmt.executeUpdate();
			if(i!=0)
			{
				System.out.println("Delet data SucessFully");
				return "SUCCESS";
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return "sorry something wents wrong!!!";
		
	}
}
