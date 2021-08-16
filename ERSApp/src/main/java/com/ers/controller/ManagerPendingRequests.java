package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.ers.entity.EmployeeEntity;
import com.ers.entity.EmployeeReimbursementEntity;
import com.ers.model.EmployeeReimbursement;

import com.ers.service.ManagerLoginService;
import com.ers.service.ManagerLoginServiceImpl;

public class ManagerPendingRequests extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	static Logger log = Logger.getLogger("ManagerPendingRequests.class");

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		log.info("INSIDE MANAGER PENDING REQUESTS SERVLET");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session1 = request.getSession(true);
		String mail=(String)session1.getAttribute("mail");
		
		
		out.println(mail);
		
		EmployeeReimbursement er= new EmployeeReimbursement();
		
		EmployeeEntity ee = new EmployeeEntity(mail);
		
		er.setEmployeeEntity(ee);
		
		
		ManagerLoginService ers = new ManagerLoginServiceImpl();
		
		List<EmployeeReimbursementEntity>ere = ers.viewAllPendingRequest(er);
		
		request.setAttribute("plist", ere);
		HttpSession session2 = request.getSession(true);
		session2.setAttribute("mail", mail);
		RequestDispatcher rd=request.getRequestDispatcher("ViewAllPendingRequests.jsp");  
        rd.forward(request,response);
		
		
		
		
	}

}
