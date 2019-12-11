package com.bridgelabz.loginregistrationOne.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.bridgelabz.loginregistrationOne.model.Login;
import com.bridgelabz.loginregistrationOne.repository.UserDetailsRepository;

@WebServlet("/login")
public class loginServlet extends HttpServlet {

	public Login login = new Login();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String userName = req.getParameter("userName");
		String password = req.getParameter("Password");

		login.setUserName(userName);
		login.setPassword(password);

		String userNameOne = login.getUserName();
		String passwordOne = login.getPassword();

		System.out.println(userNameOne + " " + passwordOne);

		try {
			boolean result = UserDetailsRepository.validate(userNameOne, passwordOne);
			if (result) {
				req.setAttribute("user", userNameOne);
				RequestDispatcher requestDis = req.getRequestDispatcher("/Home.jsp");
				requestDis.forward(req, resp);
			} else {
				String message="Invalid UserName/Password";
				req.setAttribute("m",message);
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);

//				RequestDispatcher requestDis = req.getRequestDispatcher("/login.jsp");
//				requestDis.include(req, resp); 
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}