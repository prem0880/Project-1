package com.ers.dao;


import com.ers.model.Employee;

public interface EmployeeLoginDao {

	public Boolean checkLogin(Employee e);
	
	public String checkLoginType(Employee e);
	
	public Employee ViewDetails(Employee e);
	
	public void UpdateDetails(Employee e);
	

}

