package com.bridgelabz.loginregistrationOne.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.loginregistrationOne.model.DeleteDetails;
import com.bridgelabz.loginregistrationOne.repository.DeleteDataJdbc;

@WebServlet("/delete")
public class DeleteData extends HttpServlet {

	DeleteDetails delete = new DeleteDetails();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String UserId = req.getParameter("uid");
		System.out.println(UserId);
		delete.setUserid(UserId);

		// DeleteDataJdbc deleteObject=new DeleteDataJdbc();

		String result = DeleteDataJdbc.deleteData(delete);

		if (result.equalsIgnoreCase("SUCCESS")) {
			RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
			rd.forward(req, resp);
			// req.getRequestDispatcher("Delete.jsp").forward(req, resp);
			System.out.println("Data Delete From Data Base!!!");
		} else {
			req.setAttribute("errMessage", "Id is not available");
			req.getRequestDispatcher("/Delete.jsp").forward(req, resp);
			System.out.println("Sorry someThing wents wrong!!!");
		}

	}
}
