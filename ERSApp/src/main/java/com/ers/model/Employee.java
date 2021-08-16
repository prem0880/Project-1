package com.ers.model;

public class Employee {

	private String Mail;
	private String Name;
	private String Password;
	private String Department;
	private String Contact;
	private String Type;
	
	
	
	
	public Employee(String mail, String name, String department, String contact,
			String type) {
		super();
		Mail = mail;
		Name = name;
		Department = department;
		Contact = contact;
		Type = type;
	}

	public Employee() {
		
	}
	
	public Employee(String mail) {
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
		return "Employee [Mail=" + Mail + ", Name=" + Name + ", Password=" + Password + ", Department=" + Department
				+ ", Contact=" + Contact + ", Type=" + Type + "]";
	}
	
	
	
	
}
