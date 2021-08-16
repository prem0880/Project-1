package com.ers.service;


import org.apache.log4j.Logger;

import com.ers.dao.EmployeeLoginDao;
import com.ers.dao.EmployeeLoginDaoImpl;

import com.ers.model.Employee;

public class EmployeeLoginServiceImpl implements EmployeeLoginService {

	static Logger log = Logger.getLogger("EmployeeLoginServiceImpl.class");

	EmployeeLoginDao edao = new EmployeeLoginDaoImpl();
	
	@Override
	public Boolean checkLogin(Employee e) {
	
		log.info("INSIDE CHECK LOGIN-LOGINIMPL");
		return edao.checkLogin(e);
		
	}
	@Override
	public String checkLoginType(Employee e) {
	
		log.info("INSIDE CHECK LOGIN TYPE-LOGINIMPL");
		return edao.checkLoginType(e);
	}
	
	
	@Override
	public Employee ViewDetails(Employee e) {
		log.info("INSIDE VIEW DETAILS-LOGINIMPL");
		return edao.ViewDetails(e);
	}
	
	
	
	@Override
	public void UpdateDetails(Employee e) {
		log.info("INSIDE UPDATE DETAILS-LOGINIMPL");
		edao.UpdateDetails(e);
	}
}
