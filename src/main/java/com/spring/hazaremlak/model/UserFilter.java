package com.spring.hazaremlak.model;

public class UserFilter {

 private String userName;
 private String surName;

 private String role;

public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getSurName() {
	return surName;
}
public void setSurName(String surName) {
	this.surName = surName;
}


public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public UserFilter( String userName, String surName, String role) {
	super();

	this.userName = userName;
	this.surName = surName;

	this.role = role;
}
 
 
}
