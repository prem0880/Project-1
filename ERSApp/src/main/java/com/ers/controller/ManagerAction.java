package com.ers.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.ers.model.EmployeeReimbursement;

import com.ers.service.ManagerLoginService;
import com.ers.service.ManagerLoginServiceImpl;

public class ManagerAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static Logger log = Logger.getLogger("ManagerAction.class");

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		log.info("INSIDE MANAGER ACTION SERVLET");
		
		response.setContentType("text/html");
		Integer id=(Integer.parseInt(request.getParameter("id")));
		String type=request.getParameter("type");
		
		
		EmployeeReimbursement er = new EmployeeReimbursement();
		
		er.setId(id);
		er.setStatusOfApplication(type);
		
		ManagerLoginService ers = new ManagerLoginServiceImpl();
		
		ers.responseAction(er);
		
		System.out.println("Request has been resolved!!!");
	 	RequestDispatcher rd=request.getRequestDispatcher("ManagerHome.jsp");  
        rd.forward(request,response);
 
	
	}

}
