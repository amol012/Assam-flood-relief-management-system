package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Organization")
public class Organization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int organization_id;
	
	@Column(name = "TYPE_OF_ORGANIZATION")
	private String toforg;
	
	@Column(name = "ORGANIZATION_NAME")
	private String  org_name ;
	
	@Column(name = "NAME_OF_AUTH")
	private String auth_name;
	
	@Column(name = "REGISTRATION_ID")
	private String reg_id;
	
	@Column(name = "ADDRESS")
	private String org_addr;
	
	@Column(name = "CITY")
	private String org_city;
	
	@Column(name = "CONTACT")
	private int org_contact;
	
	@Column(name = "EMAIL")
	private String org_email ;
	
	@Column(name = "WEBSITE")
	private String  weburl;
	
	@Column(name = "USERNAME" , unique = true)
	private String  username;
	
	@Column(name = "PASSWORD" , unique = true)
	private String password ;

	public Organization() {
	}

	public Organization(int organization_id, String toforg, String org_name, String auth_name, String reg_id,
			String org_addr, String org_city, int org_contact, String org_email, String weburl, String username,
			String password) {
		super();
		this.organization_id = organization_id;
		this.toforg = toforg;
		this.org_name = org_name;
		this.auth_name = auth_name;
		this.reg_id = reg_id;
		this.org_addr = org_addr;
		this.org_city = org_city;
		this.org_contact = org_contact;
		this.org_email = org_email;
		this.weburl = weburl;
		this.username = username;
		this.password = password;
	}

	public int getOrganization_id() {
		return organization_id;
	}

	public void setOrganization_id(int organization_id) {
		this.organization_id = organization_id;
	}

	public String getToforg() {
		return toforg;
	}

	public void setToforg(String toforg) {
		this.toforg = toforg;
	}

	public String getOrg_name() {
		return org_name;
	}

	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}

	public String getAuth_name() {
		return auth_name;
	}

	public void setAuth_name(String auth_name) {
		this.auth_name = auth_name;
	}

	public String getReg_id() {
		return reg_id;
	}

	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}

	public String getOrg_addr() {
		return org_addr;
	}

	public void setOrg_addr(String org_addr) {
		this.org_addr = org_addr;
	}

	public String getOrg_city() {
		return org_city;
	}

	public void setOrg_city(String org_city) {
		this.org_city = org_city;
	}

	public int getOrg_contact() {
		return org_contact;
	}

	public void setOrg_contact(int org_contact) {
		this.org_contact = org_contact;
	}

	public String getOrg_email() {
		return org_email;
	}

	public void setOrg_email(String org_email) {
		this.org_email = org_email;
	}

	public String getWeburl() {
		return weburl;
	}

	public void setWeburl(String weburl) {
		this.weburl = weburl;
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
		return "Organization [organization_id=" + organization_id + ", toforg=" + toforg + ", org_name=" + org_name
				+ ", auth_name=" + auth_name + ", reg_id=" + reg_id + ", org_addr=" + org_addr + ", org_city="
				+ org_city + ", org_contact=" + org_contact + ", org_email=" + org_email + ", weburl=" + weburl
				+ ", username=" + username + ", password=" + password + "]";
	}
	
}
