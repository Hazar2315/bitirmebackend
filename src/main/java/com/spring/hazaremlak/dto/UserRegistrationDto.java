package com.spring.hazaremlak.dto;

public class UserRegistrationDto {

	
	private String name;
	private String surName;
	private String password;
	private String email;
	 public UserRegistrationDto() {

	    }
	public UserRegistrationDto(String name, String surName, String password, String email) {
		super();
		this.name = name;
		this.surName = surName;
		this.password = password;
		this.email = email;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 
};
