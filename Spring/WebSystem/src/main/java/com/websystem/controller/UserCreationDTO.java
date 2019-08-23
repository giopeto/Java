package com.websystem.controller;

import javax.persistence.Column;

import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

public class UserCreationDTO {
	
	private String username;
		
//	private String password;
		
	private String email;
		

	@Column(name = "username", length = 20, nullable= false, unique = true)
	@Length(max = 20)
	@NotNull
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
//	@Column(name = "password", length = 50, nullable= false)
//	@Length(max = 50)
//	@NotNull
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	@Column(name = "email", length = 50, nullable= false, unique = true)
	@Length(max = 50)
	@NotNull
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
