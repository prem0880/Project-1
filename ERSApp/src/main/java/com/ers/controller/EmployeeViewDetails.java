package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.ers.model.Employee;
import com.ers.service.EmployeeLoginService;
import com.ers.service.EmployeeLoginServiceImpl;

public class EmployeeViewDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static Logger log = Logger.getLogger("EmployeeViewDetails.class");


	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		log.info("INSIDE EMPLOYEE VIEW DETAILS SERVLET");

		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession(true);
		String mail = (String)session.getAttribute("mail");
		out.println(mail);
		
		Employee employee = new Employee();
		
		employee.setMail(mail);
	
		EmployeeLoginService elogin = new EmployeeLoginServiceImpl();
		
		
		Employee eview=elogin.ViewDetails(employee);
	
		ArrayList<Employee> eview1 = new ArrayList<Employee>();
		
		eview1.add(eview);
		request.setAttribute("view",eview1);
		
		RequestDispatcher rd=request.getRequestDispatcher("ViewYourInformation.jsp");  
        rd.forward(request,response);
	}

}
