package com.spring.hazaremlak.service;

public class UserLoginResponse {
int id;
String name;
String surName;
String roles;
//boolean loginStatus;
public UserLoginResponse(int id, String name, String surName, boolean loginStatus,String roles) {
	super();
	this.id = id;
	this.name = name;
	this.surName = surName;
	//this.loginStatus = loginStatus;
	this.roles=roles;
}

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
public String getSurName() {
	return surName;
}
public void setSurName(String surName) {
	this.surName = surName;
}
//public boolean isLoginStatus() {
	//return loginStatus;
//}
//public void setLoginStatus(boolean loginStatus) {
	//this.loginStatus = loginStatus;
//}

public String getRoles() {
	return roles;
}

public void setRoles(String roles) {
	this.roles = roles;
}

}
