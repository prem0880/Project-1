package com.ers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ReimbursementRequest")
public class EmployeeReimbursementEntity {

	@Id
	@Column(name="ReimbursementId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private String ExpenseType;
	private Integer ExpenseAmount;
	private String TransactionDate;
	private String DateOfSubmission;
	private String StatusOfApplication;
	
	
	@ManyToOne
	@JoinColumn(name="EmployeeMail")
	private EmployeeEntity employeeEntity;
	
	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}
	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
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
	
	
}
