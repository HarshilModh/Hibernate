package com.bean;

public class UserBean {

	
	int userId;
	String firstName;
	String email;
	String password;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//class -- table -- map  --> user.hbm.xml [ filename*]  
	
	//UserBean - users 
	//userId - -userid  [pk] [int] 
	//email --- email [string] 
	
	
}