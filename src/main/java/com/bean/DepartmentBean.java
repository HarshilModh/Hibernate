package com.bean;

public class DepartmentBean {
	int deptid;
	String deptname;
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	EmployeeBean employee;;
	public EmployeeBean getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeBean employee) {
		this.employee = employee;
	}
	
	
	

}
