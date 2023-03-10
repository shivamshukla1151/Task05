package com.employee;

public class Employee {

	String name, department, designation, email, address, contact;
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
		super();

	}

	public Employee(String name, String department, String designation, String email, String address, String contact) {
		super();
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.email = email;
		this.address = address;
		this.contact = contact;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", designation=" + designation + ", email="
				+ email + ", address=" + address + ", contact=" + contact + ", id=" + id + "]";
	}

}
