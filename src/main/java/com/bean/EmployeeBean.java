package com.bean;


public class EmployeeBean {
	int empid;
	String city,empname;
	DepartmentBean department;
	
	
 	public DepartmentBean getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentBean department) {
		this.department = department;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	

}
