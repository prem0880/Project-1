package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.ers.service.ManagerLoginService;
import com.ers.service.ManagerLoginServiceImpl;

public class ManagerEmployeeView extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	static Logger log = Logger.getLogger("ManagerEmployeeView.class");

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		log.info("INSIDE MANAGER EMPLOYEE VIEW SERVLET");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession(true);
		String mail =(String) session.getAttribute("mail");
		
		ManagerLoginService elogin = new ManagerLoginServiceImpl();

		List<String > l=elogin.viewSpecificEmployee();
	
	    HashSet<String> hset = new HashSet<String>(l);
		out.println("<form action='http://localhost:8080/ERSApp/ManagerSpecificView' method='get'>");
		out.println("Employee Mail:"+"<select name='id' >");
		
		for(String e:hset) {
			
			out.println("<option name='id'>"+e+"");
		}
		out.println("</select>");
		out.println("<input type='submit' name='type' value='view'/>");
		
		out.println("</form>");
		
	}

}
