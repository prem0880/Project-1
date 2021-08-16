package com.ers.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.ers.model.Employee;
import com.ers.utility.EmployeeMapper;
import com.ers.utility.HibernateUtil;


public class EmployeeRegisterDaoImpl implements EmployeeRegisterDao{

	
	static Logger log = Logger.getLogger("EmployeeRegisterDaoImpl.class");
	
	
	@Override
	public String addEmployee(Employee e) {
		
		log.info("INSIDE ADD EMPLOYEE-DAO IMPL");
		
		String stat=null;
		try {
			System.out.println(e.getMail()+" "+e.getName());
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction(); 
			stat=(String) session.save(EmployeeMapper.mapEmployee(e));
			System.out.println("employee inserted...");
			session.getTransaction().commit();
			
	
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		return stat;
		
	}
	
}
