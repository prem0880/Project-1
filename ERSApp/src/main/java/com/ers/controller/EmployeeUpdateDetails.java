package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.ers.model.Employee;
import com.ers.service.EmployeeLoginService;
import com.ers.service.EmployeeLoginServiceImpl;

public class EmployeeUpdateDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static Logger log = Logger.getLogger("EmployeeUpdateDetails.class");
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		log.info("INSIDE UPDATE DETAILS SERVLET");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session1 = request.getSession(true);
		String mail=(String)session1.getAttribute("mail");
		
		String name=request.getParameter("name");
		String dep=request.getParameter("department");
		String contact=request.getParameter("contact");
		
		Employee employee = new Employee();
		employee.setMail(mail);
		employee.setName(name);
		employee.setDepartment(dep);
		employee.setContact(contact);
		
		EmployeeLoginService elogin = new EmployeeLoginServiceImpl();
		
		elogin.UpdateDetails(employee);
	
		request.getRequestDispatcher("EmployeeHome.jsp").include(request, response);
         
        out.close();
	}

}
