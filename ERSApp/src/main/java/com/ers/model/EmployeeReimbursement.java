package com.ers.model;

import com.ers.entity.EmployeeEntity;

public class EmployeeReimbursement {

	private Integer Id;
	private String ExpenseType;
	private Integer ExpenseAmount;
	private String TransactionDate;
	private String DateOfSubmission;
	private	String StatusOfApplication;
	private EmployeeEntity employeeEntity;
	
	
	public EmployeeReimbursement() {
		super();
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getExpenseType() {
		return ExpenseType;
	}
	public void setExpenseType(String expenseType) {
		ExpenseType = expenseType;
	}
	public Integer getExpenseAmount() {
		return ExpenseAmount;
	}
	public void setExpenseAmount(Integer expenseAmount) {
		ExpenseAmount = expenseAmount;
	}
	public String getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		TransactionDate = transactionDate;
	}
	public String getDateOfSubmission() {
		return DateOfSubmission;
	}
	public void setDateOfSubmission(String dateOfSubmission) {
		DateOfSubmission = dateOfSubmission;
	}
	
	public String getStatusOfApplication() {
		return StatusOfApplication;
	}
	public void setStatusOfApplication(String statusOfApplication) {
		StatusOfApplication = statusOfApplication;
	}
	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}
	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
	}
	
	
	
	
	
}
