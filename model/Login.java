package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Login") 
public class Login {
	
	
	@Id
	@Column(name = "RoleType")
	private String roleType;
	
	@Column(name = "Username")
	private String  username;
	
	@Column(name = "Password")
	private String password;
	
	
	
	public Login() {
	}
	public Login(String roleType, String username, String password) {
		this.roleType = roleType;
		this.username = username;
		this.password = password;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [roleType=" + roleType + ", username=" + username + ", password=" + password + "]";
	}
	
	

}
