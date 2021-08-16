package com.ers.utility;

import com.ers.entity.EmployeeEntity;
import com.ers.model.Employee;

public class EmployeeMapper {
	
	public static EmployeeEntity mapEmployee(Employee e) {
		EmployeeEntity entity=new EmployeeEntity();
		entity.setMail(e.getMail());
		entity.setName(e.getName());
		entity.setPassword(e.getPassword());
		entity.setDepartment(e.getDepartment());
		entity.setContact(e.getContact());
		entity.setType(e.getType());
		return entity;
		
	}

}
