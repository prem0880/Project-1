package com.ers.dao;


import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.ers.entity.EmployeeEntity;
import com.ers.model.Employee;
import com.ers.utility.EmployeeMapper;
import com.ers.utility.HibernateUtil;

public class EmployeeLoginDaoImpl implements EmployeeLoginDao {

	
	static Logger log = Logger.getLogger("EmployeeLoginDaoImpl.class");
		
	@Override
	public Boolean checkLogin(Employee e) {
	
		log.info("INSIDE CHECK LOGIN-DAO IMPLEMENTATION");
		
		Boolean stat=false;  
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			EmployeeEntity ee=EmployeeMapper.mapEmployee(e);
			if (session != null) {
				   try {
				    EmployeeEntity ee1 =  session.get(EmployeeEntity.class, ee.getMail());
				    System.out.println(ee1.getType());
				    if (e.getPassword().equals(ee1.getPassword())) {
				     System.out.println("User: " + ee1.toString());
				     stat=true;
				     }
				   } 
				   catch (Exception exception) {
				    System.out.println("Exception occured while reading user data: "
				      + exception.getMessage());
				    stat=false;
				   }

				  }
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		return stat;
		
	}
	@Override
	public String checkLoginType(Employee e) {
	
		log.info("INSIDE CHECK LOGIN TYPE-DAO IMPLEMENTATION");
		
	String stat="null"; 
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			EmployeeEntity ee=EmployeeMapper.mapEmployee(e);
			if (session != null) {
				   try {
					EmployeeEntity ee1 =  session.get(EmployeeEntity.class, ee.getMail());
					System.out.println(ee1.toString());
					if (ee1.getType().equals("manager")) {
							System.out.println("manager here!!!");
				    		stat="manager";
				     }
				    else if(ee1.getType().equals("employee"))
				    {
				    	System.out.println("employee here!!!");
				    		stat="employee";
				    }
				    
				   } 
				   catch (Exception e1) {
					   e1.printStackTrace();
				   }

				  }
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		return stat;

	}
	
	
	
	@Override
	public Employee ViewDetails(Employee e) {
		log.info("INSIDE VIEW DETAILS-DAO IMPLEMENTATION");
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		EmployeeEntity ee=EmployeeMapper.mapEmployee(e);
		if (session != null) {
			   try {
				EmployeeEntity ee1 =  session.get(EmployeeEntity.class, ee.getMail());
				e = new Employee(ee1.getMail(),ee1.getName(),ee1.getDepartment(),ee1.getContact(),ee1.getType());
				
			   }   catch (Exception e1) {
				   e1.printStackTrace();
			   }
			   
		
		
		}
		   return e;
	}
	
	
	
	
	
	@Override
	public void UpdateDetails(Employee e) {
	
		log.info("INSIDE UPDATE DETAILS-DAO IMPLEMENTATION");
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction(); 
			EmployeeEntity ee=EmployeeMapper.mapEmployee(e);
			if(session!=null) {
				
				EmployeeEntity ee1 =  session.get(EmployeeEntity.class, ee.getMail());
				
				if(ee1.getName().equals(e.getName()) == false) {
				ee1.setName(e.getName());}
				if(ee1.getDepartment().equals(e.getDepartment()) == false) {
				ee1.setDepartment(e.getDepartment());}
				if(ee1.getContact().equals(e.getContact()) == false) {
				ee1.setContact(e.getContact());}
				
				session.saveOrUpdate(ee1);
				System.out.println("Employee Details Updated...");
				session.getTransaction().commit();
				
				
			}
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		
		
	}
	
}
