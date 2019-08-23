package com.websystem.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

import com.websystem.bean.domain.AbstractEntity;
import com.websystem.bean.enums.PermissionEnum;


@Entity
@Table(name = "users")
public class User extends AbstractEntity {
	
	private static final long serialVersionUID = 4885002657271913524L;

    private String username;
	
	private String password;
	
//	private PermissionEnum permission;
	
	private String email;
	
//	private String token;

	
	public User() {}
	

	@Column(name = "username", length = 20, nullable= false, unique = true)
	@Length(max = 20)
	@NotNull
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "password", length = 50, nullable= false)
	@Length(max = 50)
	@NotNull
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	@Enumerated(EnumType.STRING)
//	@Column(name = "permission", length = 32, nullable = false)
//	@Length(max = 32)
//	@NotNull
//	public PermissionEnum getPermission() {
//		return permission;
//	}
//
//	public void setPermission(PermissionEnum permission) {
//		this.permission = permission;
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
	
//	@Column(name = "token", length = 255, nullable= false)
//	@Length(max = 255)
//	@NotNull
//	public String getToken() {
//		return token;
//	}
//
//	public void setToken(String token) {
//		this.token = token;
//	}	

}