package com.ers.utility;



import com.ers.entity.EmployeeReimbursementEntity;
import com.ers.model.EmployeeReimbursement;

public class EmployeeReimbursementMapper {

	public static EmployeeReimbursementEntity mapReimbursement(EmployeeReimbursement er) {
		EmployeeReimbursementEntity entity=new EmployeeReimbursementEntity();
	    entity.setEmployeeEntity(er.getEmployeeEntity());
	    entity.setExpenseType(er.getExpenseType());
	    entity.setExpenseAmount(er.getExpenseAmount());
	    entity.setTransactionDate(er.getTransactionDate());
	    entity.setDateOfSubmission(er.getDateOfSubmission());
	    entity.setStatusOfApplication(er.getStatusOfApplication());
	    return entity;
	    
		
		
	
	}
	
}
