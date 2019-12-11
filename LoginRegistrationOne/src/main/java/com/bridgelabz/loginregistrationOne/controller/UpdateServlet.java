package com.bridgelabz.loginregistrationOne.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.loginregistrationOne.model.PersonDetails;
import com.bridgelabz.loginregistrationOne.repository.UserDetailsRepository;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet{
	
	PersonDetails person=new PersonDetails();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String firstName=req.getParameter("FirstName");
		String lastName=req.getParameter("LastName");
		String phoneNo=req.getParameter("PhoneNo");
		String emailid=req.getParameter("Emailid");
		String userId=req.getParameter("UserId");
		
		System.out.println("user Id "+userId);
		
		person.setFirstName(firstName);
		person.setLastname(lastName);
		person.setEmailId(emailid);
		person.setPhoneNumber(phoneNo);
		person.setUserName(userId);
		
		System.out.println("person::"+person);
		
		try {
			System.out.println(person);
			String userUpdate=UserDetailsRepository.edit(person);

			if (userUpdate.equalsIgnoreCase("SUCCESS")) {
				req.getRequestDispatcher("/Home.jsp").forward(req, resp);
			} else {
				req.setAttribute("errMessage", userUpdate);
				req.getRequestDispatcher("/loginPage.jsp").forward(req, resp);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		}
		
		
		
	}
}
