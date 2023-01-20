package com.spring.hazaremlak.model;


import java.util.Set;

import javax.persistence.*;








@Entity
@Table(name="users")

public class User {
	
	@Column(name="user_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="user_name",nullable=false)
	private String userName;

	@Column(name="user_surname")
	private String surName;
	
	@Column(name="user_password")
	private String password;

	@Column(name="user_mail")
	private String email;
	
	@Column(name="user_roles")
	private String role;
	
	@OneToMany(mappedBy="user",cascade = CascadeType.ALL)
	private Set<CommentRating>commentRating;
	
	
	public User() {
		super();
	}
	public User(String userName, String surName,  String email,String password,String role) {
		super();
		this.userName = userName;
		this.surName = surName;
		this.password = password;
		this.email = email;
		this.role = role;
		
	}


	public User( int id,String userName, String password) {
		super();
	
		this.userName = userName;
		this.password = password;
		this.id=id;
		
	}

	

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSurName() {
		return surName;
	}

	public void setSurName(String sirName) {
		this.surName = sirName;
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
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public int hashCode() {
		
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		
		
		if(obj==null || !(obj instanceof User) )
			return false;
		return this.id==((User)obj).getId();
	}






	
	

}
