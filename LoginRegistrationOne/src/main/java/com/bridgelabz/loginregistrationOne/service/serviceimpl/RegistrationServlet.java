package com.bridgelabz.loginregistrationOne.service.serviceimpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.loginregistrationOne.model.PersonDetails;
import com.bridgelabz.loginregistrationOne.repository.InsertQuery;

@WebServlet("/loginImpl")
public class RegistrationServlet extends HttpServlet implements Servlet, Filter {

	private static final long serialVersionUID = 1L;
	public List<PersonDetails> list = new ArrayList<PersonDetails>();
	PersonDetails person = new PersonDetails();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		String emailId = req.getParameter("emailId");
		String phoneNumber = req.getParameter("phoneNumber");
		String confirmPassword = req.getParameter("ConfirmPassword");
		System.out.println(firstName + " " + lastName + " " + userName + " " + password + " " + emailId + " "
				+ phoneNumber + " " + confirmPassword);

		person.setFirstName(firstName);
		person.setLastname(lastName);
		person.setUserName(userName);
		person.setPassword(password);
		person.setEmailId(emailId);
		person.setPhoneNumber(phoneNumber);
		person.setConformPassword(confirmPassword);

		System.out.println("Person " + person);
		InsertQuery personInfo = new InsertQuery();

		String userRegistered = personInfo.registeredUser(person);

		if (userRegistered.equalsIgnoreCase("SUCCESS")) {
			req.getRequestDispatcher("/Home.jsp").forward(req, resp);
		} else {
			req.setAttribute("errMessage", userRegistered);
			req.getRequestDispatcher("/loginPage.jsp").forward(req, resp);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

	}
}
