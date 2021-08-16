package com.ers.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.ers.model.Employee;
import com.ers.service.EmployeeRegisterServiceImpl;

@WebServlet("/EmployeeRegisterServlet")
public class EmployeeRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger log = Logger.getLogger("EmployeeRegisterServlet.class");

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		log.info("INSIDE EMPLOYEE REGISTER SERVLET");
		
		response.setContentType("text/html");
		
		String mail=request.getParameter("mailid");
		String name=request.getParameter("ename");
		String pwd=request.getParameter("pass");
		String dep=request.getParameter("department");
		String contact=request.getParameter("phone");
		String type=request.getParameter("type");
		
		Employee employee = new Employee();
		employee.setMail(mail);
		employee.setName(name);
		employee.setPassword(pwd);
		employee.setDepartment(dep);
		employee.setContact(contact);
		employee.setType(type);
		
		
		EmployeeRegisterServiceImpl eregister = new EmployeeRegisterServiceImpl();
	
		String status=eregister.addEmployee(employee);
		
		if(status.isEmpty()==false)
		{
			System.out.println("Registration is done successfully!!!");
		 	RequestDispatcher rd=request.getRequestDispatcher("Login.html");  
	        rd.forward(request,response);
			
		}
		else
		{
			System.out.println("Registration is not done successfully!!!");
		 	RequestDispatcher rd=request.getRequestDispatcher("SignUp.html");  
	        rd.forward(request,response);
		}
		
		
	}

}
