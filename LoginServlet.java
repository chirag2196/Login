package com.AscentisBank;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setHeader("Access-Control-Allow-Origin", "*");
	    response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
	    response.setHeader("Access-Control-Allow-Headers", "Content-Type, X-Requested-With");
	    response.setStatus(HttpServletResponse.SC_OK);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type,X-Requested-With");
	    
//		resp.setContentType("application/json");
//	    resp.setCharacterEncoding("UTF-8");
//		resp.addHeader("Access-Control-Allow-Origin", "*");
	    
	    
		
		String nameString = req.getParameter("name");
		String emailString = req.getParameter("email");
		String mobileString = req.getParameter("mobile");
		String stateString = req.getParameter("state");
		String msgString = req.getParameter("message");
		
//		RequestDispatcher rDispatcher = req.getRequestDispatcher("home.html");
		resp.setContentType("text/html");
		PrintWriter outWriter = resp.getWriter();
		outWriter.println("Name: " + nameString+"<br>");
		outWriter.println("Email: " + emailString+"<br>");
		outWriter.println("Mobile No: " + mobileString+"<br>");
		outWriter.println("State: " + stateString+"<br>");
		outWriter.println("Message: " + msgString+"<br>");
//		rDispatcher.include(req, resp);
	}
}
