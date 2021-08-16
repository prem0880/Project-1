package com.ers.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.ers.entity.EmployeeReimbursementEntity;

import com.ers.model.EmployeeReimbursement;
import com.ers.utility.HibernateUtil;
import com.ers.utility.EmployeeReimbursementMapper;

public class EmployeeReimbursementDaoImpl implements EmployeeReimbursementDao {

	
	static Logger log = Logger.getLogger("EmployeeReimbursementDaoImpl.class");
	
	
	
	@Override
	public Integer addRequest(EmployeeReimbursement er) {
		
		
		log.info("INSIDE ADD REQUEST-DAO IMPL");
		
		
		Integer stat=0;
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction(); 
			stat=(Integer)session.save(EmployeeReimbursementMapper.mapReimbursement(er));
			System.out.println("employee inserted...");
			session.getTransaction().commit();

		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		return stat;
	
	}
	
	@Override
	public List<EmployeeReimbursementEntity> viewPendingRequest(EmployeeReimbursement er) {
		
		log.info("INSIDE VIEW PENDING REQUESTS-DAO IMPL");
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Query query=session.createQuery("FROM EmployeeReimbursementEntity R WHERE R.StatusOfApplication = 'pending' AND R.employeeEntity.Mail=:id");
		query.setParameter("id",er.getEmployeeEntity().getMail() );
		return query.list();
	}
	
	@Override
	public List<EmployeeReimbursementEntity> viewResolvedRequest(EmployeeReimbursement er) {
	
		log.info("INSIDE VIEW RESOLVED REQUESTS-DAO IMPL");
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Query query=session.createQuery("FROM EmployeeReimbursementEntity R WHERE R.StatusOfApplication!= 'pending' AND R.employeeEntity.Mail=:id");
		query.setParameter("id",er.getEmployeeEntity().getMail() );
		return query.list();
	}
	
	
		
}
