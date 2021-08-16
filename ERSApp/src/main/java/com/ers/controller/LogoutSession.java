package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

public class LogoutSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	static Logger log = Logger.getLogger("LogoutSession.class");


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		log.info("INSIDE LOG OUT SESSION SERVLET");
		
		PrintWriter out=response.getWriter();  
         
         request.getRequestDispatcher("Login.html").include(request, response);  
           
         HttpSession session=request.getSession();  
         session.invalidate();  
           
         out.print("You are successfully logged out!");  
           
         out.close();
	}

}
