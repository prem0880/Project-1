package com.ers.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.ers.entity.EmployeeEntity;
import com.ers.entity.EmployeeReimbursementEntity;
import com.ers.model.EmployeeReimbursement;
import com.ers.utility.HibernateUtil;

public class ManagerLoginDaoImpl implements ManagerLoginDao{

	
	static Logger log = Logger.getLogger("ManagerLoginDaoImpl.class");
	
	
	
	@Override
	public List<EmployeeEntity> ViewAllDetails() {
	
		log.info("INSIDE VIEW ALL DETAILS-DAO IMPL");
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		return session.createQuery("FROM EmployeeEntity", EmployeeEntity.class).getResultList();
		
		
	}
	@Override
	public List<Integer> requestAction() {
		log.info("INSIDE REQUEST ACTION-DAO IMPL");
		
		List<Integer> list=new ArrayList<Integer>();
		Session session=HibernateUtil.getSessionFactory().openSession();
		Query query=session.createQuery("select r.id from EmployeeReimbursementEntity r where r.StatusOfApplication= 'pending'");
		list=query.list();
		for(int x:list) {System.out.println(x);}
		return list;
	}
	
	@Override
	public void responseAction(EmployeeReimbursement er) {
		log.info("INSIDE RESPONSE ACTION-DAO IMPL");
		
		try{
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction(); 
		EmployeeReimbursementEntity rid=session.load(EmployeeReimbursementEntity.class,er.getId());
		rid.setStatusOfApplication(er.getStatusOfApplication());
		session.merge(rid);
		System.out.println("status...");
		session.getTransaction().commit();
		session.close();
		}catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
	
	@Override
	public List<EmployeeReimbursementEntity> viewAllPendingRequest(EmployeeReimbursement er) {
		
		log.info("INSIDE VIEW ALL PENDING REQUESTS-DAO IMPL");
		
		Session session=HibernateUtil.getSessionFactory().openSession();
	    return session.createQuery("FROM EmployeeReimbursementEntity R WHERE R.StatusOfApplication = 'pending'", EmployeeReimbursementEntity.class).getResultList();
    }
	
	@Override
	public List<EmployeeReimbursementEntity> viewAllResolvedRequest(EmployeeReimbursement er) {

		log.info("INSIDE VIEW ALL RESOLVED REQUESTS-DAO IMPL");
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		return session.createQuery("FROM EmployeeReimbursementEntity R WHERE R.StatusOfApplication = 'approve' OR R.StatusOfApplication = 'reject' ", EmployeeReimbursementEntity.class).getResultList();	

	
	}

	@Override
	public List<String> viewSpecificEmployee() {
		
		log.info("INSIDE VIEW SPECIFIC EMPLOYEE-DAO IMPL");
		
		List<String> list=new ArrayList<String>();
		Session session=HibernateUtil.getSessionFactory().openSession();
		Query query=session.createQuery("SELECT employeeEntity.Mail FROM EmployeeReimbursementEntity ");
		list=query.list();
		return list;
	}
	
	public List<EmployeeReimbursementEntity> viewSpecificEmployeeReimbursement(EmployeeReimbursement er){
		
		log.info("INSIDE VIEW SPECIFIC EMPLOYEE REIMBURSEMENT-DAO IMPL");
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Query query=session.createQuery("FROM EmployeeReimbursementEntity R WHERE R.employeeEntity.Mail=:id");
		query.setParameter("id",er.getEmployeeEntity().getMail() );
		return query.list();
	}
}
