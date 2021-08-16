package com.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Test;

import com.ers.dao.ManagerLoginDao;
import com.ers.dao.ManagerLoginDaoImpl;
import com.ers.entity.EmployeeEntity;

public class ManagerLoginTest {

	@Test
	public void testViewAllDetails() {
	
		
		
		List<EmployeeEntity> list=new ArrayList<EmployeeEntity>();
		
		ManagerLoginDao mld= new ManagerLoginDaoImpl();
		list=mld.ViewAllDetails();
		assertNotNull(list);
		 
		
	}
	
	@Test
	public void testrequestAction()
	{
		List<Integer> list=new ArrayList<Integer>();

		ManagerLoginDao mld= new ManagerLoginDaoImpl();
		list=mld.requestAction();
		assertNotNull(list);
	}
	
	@Test
	public void testviewSpecificEmployee()
	{
		List<String> list=new ArrayList<String>();
		ManagerLoginDao mld= new ManagerLoginDaoImpl();
		list=mld.viewSpecificEmployee();
		System.out.println(list);
		assertNotNull(list);
	}
	
}
