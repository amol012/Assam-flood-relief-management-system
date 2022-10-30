package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Volunteer")
public class Volunteer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Volunteer_id")

	private long volunteer_id;
	
	@Column(name = "FIRST_NAME")
	private String vl_fname;
	
	@Column(name = "LAST_NAME")
	private String vl_lname;
	
	@Column(name = "BLOOD_GROUP")
	private String blood_grp;
	
	@Column(name = "CONTACT")
	private String vl_contact;
	
	@Column(name = "ADDRESS")
	private String vl_addr;
	
	@Column(name = "CITY")
	private String vl_city;
	
	@Column(name = "EMAIL")
	private String vl_email;
	
	@Column(name = "Type_Of_Work")
	private String vl_tow;
	
	@Column(name = "USERNAME" ,unique = true)
	private String username;
	
	@Column(name = "PASSWORD" ,unique = true)
	private String password;

	public Volunteer() {
	}

	public Volunteer(int volunteer_id, String vl_fname, String vl_lname, String blood_grp, String vl_contact,
			String vl_addr, String vl_city, String vl_email, String vl_tow, String username, String password) {
		super();
		this.volunteer_id = volunteer_id;
		this.vl_fname = vl_fname;
		this.vl_lname = vl_lname;
		this.blood_grp = blood_grp;
		this.vl_contact = vl_contact;
		this.vl_addr = vl_addr;
		this.vl_city = vl_city;
		this.vl_email = vl_email;
		this.vl_tow = vl_tow;
		this.username = username;
		this.password = password;
	}



	public long getVolunteer_id() {
		return volunteer_id;
	}

	public void setVictim_id(int volunteer_id) {
		this.volunteer_id = volunteer_id;
	}

	public String getVl_fname() {
		return vl_fname;
	}

	public void setVl_fname(String vl_fname) {
		this.vl_fname = vl_fname;
	}

	public String getVl_lname() {
		return vl_lname;
	}

	public void setVl_lname(String vl_lname) {
		this.vl_lname = vl_lname;
	}

	public String getBlood_grp() {
		return blood_grp;
	}

	public void setBlood_grp(String blood_grp) {
		this.blood_grp = blood_grp;
	}

	public String getVl_contact() {
		return vl_contact;
	}

	public void setVl_contact(String vl_contact) {
		this.vl_contact = vl_contact;
	}

	public String getVl_addr() {
		return vl_addr;
	}

	public void setVl_addr(String vl_addr) {
		this.vl_addr = vl_addr;
	}

	public String getVl_city() {
		return vl_city;
	}

	public void setVl_city(String vl_city) {
		this.vl_city = vl_city;
	}

	public String getVl_email() {
		return vl_email;
	}

	public void setVl_email(String vl_email) {
		this.vl_email = vl_email;
	}

	public String getVl_tow() {
		return vl_tow;
	}

	public void setVl_tow(String vl_tow) {
		this.vl_tow = vl_tow;
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
		return "Volunteer [volunteer_id=" + volunteer_id + ", vl_fname=" + vl_fname + ", vl_lname=" + vl_lname
				+ ", blood_grp=" + blood_grp + ", vl_contact=" + vl_contact + ", vl_addr=" + vl_addr + ", vl_city="
				+ vl_city + ", vl_email=" + vl_email + ", vl_tow=" + vl_tow + ", username=" + username + ", password="
				+ password + "]";
	}
	
	


	

}
