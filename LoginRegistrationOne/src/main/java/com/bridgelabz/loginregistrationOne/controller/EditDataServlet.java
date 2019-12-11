package com.bridgelabz.loginregistrationOne.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.loginregistrationOne.model.PersonDetails;
import com.bridgelabz.loginregistrationOne.repository.UserDetailsRepository;

@WebServlet("/edit")
public class EditDataServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId = req.getParameter("uid");
		
		try {
			PersonDetails details = UserDetailsRepository.getOneUserDetails(userId);
			req.setAttribute("userdetails", details);
			RequestDispatcher dispatcher = req.getRequestDispatcher("Edit.jsp");
			dispatcher.forward(req, resp);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
}
