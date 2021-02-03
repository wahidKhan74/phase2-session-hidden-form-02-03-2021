package com.ecom.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserInfoHiddenFormHandler
 */
@WebServlet("/user-info")
public class UserInfoHiddenFormHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInfoHiddenFormHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// fetch data from user input
		String userId = request.getParameter("userId");
		String userName = request.getParameter("name");
		
		out.println("<p>Welcome to user info "+userName+"</p>");
		
		// create hidden form fields
		out.println("<form method='post' action='profile'>");
		out.println("<input type='hidden' name='userName' value='"+userName+"'>");
		out.println("<input type='hidden' name='userId' value='"+userId+"'>");
		out.println("<input type='submit' value='Go to Profile' >");
		out.println("</form>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
