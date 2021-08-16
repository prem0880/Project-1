package com.ers.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.ers.dao.EmployeeReimbursementDaoImpl;
import com.ers.entity.EmployeeReimbursementEntity;
import com.ers.model.EmployeeReimbursement;

public class EmployeeReimbursementServiceImpl implements EmployeeReimbursementService {

	static Logger log = Logger.getLogger("EmployeeReimbursementServiceImpl.class");

	EmployeeReimbursementDaoImpl erd= new EmployeeReimbursementDaoImpl();
	@Override
	public Integer addRequest(EmployeeReimbursement er) {
	
		
		log.info("INSIDE ADD REQUEST-REIMBURSEMENT SERVICE IMPL");
		
		return erd.addRequest(er);
		
		
	}
	
	@Override
	public List<EmployeeReimbursementEntity>  viewPendingRequest(EmployeeReimbursement er) {
	

		log.info("INSIDE VIEW PENDING REQUEST-REIMBURSEMENT SERVICE IMPL");
		
		return erd.viewPendingRequest(er);
		
	}
	@Override
	public List<EmployeeReimbursementEntity> viewResolvedRequest(EmployeeReimbursement er) {


		log.info("INSIDE VIEW RESOLVED REQUESTS-REIMBURSEMENT SERVICE IMPL");
		
		return erd.viewResolvedRequest(er);
		
	}
	
	
}

