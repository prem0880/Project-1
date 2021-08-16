package com.ers.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.ers.entity.EmployeeEntity;
import com.ers.service.ManagerLoginService;
import com.ers.service.ManagerLoginServiceImpl;

public class ManagerViewDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static Logger log = Logger.getLogger("ManagerViewDetails.class");

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		log.info("INSIDE MANAGER VIEW DETAILS SERVLET");
	
		response.setContentType("text/html");
		
		HttpSession session = request.getSession(true);
		Integer id = (Integer) session.getAttribute("uname");
		
		ManagerLoginService elogin = new ManagerLoginServiceImpl();
		
		List<EmployeeEntity> e = elogin.ViewAllDetails();
		
		request.setAttribute("viewall",e);
		
		RequestDispatcher rd=request.getRequestDispatcher("ViewAllInformation.jsp");  
        rd.forward(request,response);
		
		
	
	}

}
