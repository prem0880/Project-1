package com.ers.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.ers.dao.ManagerLoginDao;
import com.ers.dao.ManagerLoginDaoImpl;
import com.ers.entity.EmployeeEntity;
import com.ers.entity.EmployeeReimbursementEntity;
import com.ers.model.EmployeeReimbursement;

public class ManagerLoginServiceImpl implements ManagerLoginService{

	static Logger log = Logger.getLogger("ManagerLoginServiceImpl.class");
	
	ManagerLoginDao mld= new ManagerLoginDaoImpl();
	
	@Override
	public List<EmployeeEntity> ViewAllDetails() {

	log.info("INSIDE VIEW ALL DETAILS-MANAGER LOGIN IMPL");	
		
    return	mld.ViewAllDetails();
	
	}
	
	@Override
	public List<Integer> requestAction() {
		log.info("INSIDE REQUEST ACTION-MANAGER LOGIN IMPL");	
		
		return mld.requestAction();
	}
	@Override
	public void responseAction(EmployeeReimbursement er) {
		log.info("INSIDE RESPONSE ACTION-MANAGER LOGIN IMPL");	
		
		mld.responseAction(er);
		
	}
	@Override
	public List<EmployeeReimbursementEntity> viewAllPendingRequest(EmployeeReimbursement er) {
		log.info("INSIDE VIEW ALL PENDING REQUESTS-MANAGER LOGIN IMPL");	
		
		return mld.viewAllPendingRequest(er);
	}
	@Override
	public List<EmployeeReimbursementEntity> viewAllResolvedRequest(EmployeeReimbursement er) {
		log.info("INSIDE VIEW ALL RESOLVED REQUESTS-MANAGER LOGIN IMPL");	
		
		return mld.viewAllResolvedRequest(er);
	}
	
	@Override
	public List<String> viewSpecificEmployee() {
		log.info("INSIDE VIEW SPECIFIC EMPLOYEE-MANAGER LOGIN IMPL");	
		
		return mld.viewSpecificEmployee();
	}
	@Override
	public List<EmployeeReimbursementEntity> viewSpecificEmployeeReimbursement(EmployeeReimbursement er) {
		log.info("INSIDE VIEW SPECIFIC EMPLOYEE REIMBURSEMENT-MANAGER LOGIN IMPL");	
		
		return mld.viewSpecificEmployeeReimbursement(er);
	}
}
