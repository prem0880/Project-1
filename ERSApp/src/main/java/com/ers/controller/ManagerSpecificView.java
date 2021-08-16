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

public class ManagerSpecificView extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static Logger log = Logger.getLogger("ManagerSpecificView.class");

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		log.info("INSIDE MANAGER SPECIFIC VIEW SERVLET");
		
		PrintWriter out=response.getWriter();
		
		response.setContentType("text/html");
		String mailid=request.getParameter("id");
		String type=request.getParameter("type");
		
		out.println(mailid +"  "+type);	
		
		
		EmployeeReimbursement er = new EmployeeReimbursement();
		EmployeeEntity ee = new EmployeeEntity(mailid);
		
		System.out.println(ee.getMail());
		er.setEmployeeEntity(ee);
		
		ManagerLoginService ers = new ManagerLoginServiceImpl();
		List<EmployeeReimbursementEntity> slist=ers.viewSpecificEmployeeReimbursement(er);
		request.setAttribute("slist", slist);
		HttpSession session2 = request.getSession(true);
		session2.setAttribute("mail", mailid);
		RequestDispatcher rd=request.getRequestDispatcher("ViewSpecificEmployees.jsp");  
        rd.forward(request,response);
	
	
}

}
