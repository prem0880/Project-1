package com.ers.service;

import org.apache.log4j.Logger;

import com.ers.dao.EmployeeRegisterDaoImpl;
import com.ers.model.Employee;

public class EmployeeRegisterServiceImpl implements EmployeeRegisterService {

	EmployeeRegisterDaoImpl edao = new EmployeeRegisterDaoImpl();
	
	static Logger log = Logger.getLogger("EmployeeRegisterServiceImpl.class");

	@Override
	public String addEmployee(Employee e) {
	
		log.info("INSIDE ADD EMPLOYEE-SERVICEIMPL");
		
		return edao.addEmployee(e);	
		
	}
}
