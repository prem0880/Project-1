package com.ers.service;

import java.util.List;

import com.ers.entity.EmployeeEntity;
import com.ers.entity.EmployeeReimbursementEntity;
import com.ers.model.EmployeeReimbursement;

public interface ManagerLoginService {

	
	public List<EmployeeEntity> ViewAllDetails();
	
	public List<Integer>  requestAction();
	
	public void responseAction(EmployeeReimbursement er);
	
	public List<EmployeeReimbursementEntity>  viewAllPendingRequest(EmployeeReimbursement er);
	
	public List<EmployeeReimbursementEntity>  viewAllResolvedRequest(EmployeeReimbursement er);
	
	public List<String> viewSpecificEmployee();
	
	public List<EmployeeReimbursementEntity> viewSpecificEmployeeReimbursement(EmployeeReimbursement er);

}
