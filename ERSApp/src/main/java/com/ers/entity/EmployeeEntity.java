package com.ers.entity;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name="Employee")
public class EmployeeEntity {

	@Id
	@Column(name="EmployeeMail")
	private String Mail;
	@Column(name="EmployeeName")
	private String Name;
	@Column(name="EmployeePassword")
	private String Password;
	@Column(name="EmployeeDepartment")
	private String Department;
	@Column(name="EmployeeContact")
	private String Contact;
	@Column(name="EmployeeType")
	private String Type;
	
	@OneToMany(mappedBy="employeeEntity",cascade=CascadeType.ALL)
	private Set<EmployeeReimbursementEntity> rset;
	
	
	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(String mail) {
		super();
		Mail = mail;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}


	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [Mail=" + Mail + ", Name=" + Name + ", Password=" + Password + ", Department="
				+ Department + ", Contact=" + Contact + ", Type=" + Type + "]";
	}

	

	
}
