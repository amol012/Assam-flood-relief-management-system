package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Victim") // Victim Table
public class Victim {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "v_id")
	private long victim_id;
	
	@Column(name = "FIRST_NAME")
	private String v_fname;
	
	@Column(name = "LAST_NAME")
	private String v_lname;
	
	@Column(name = "CONTACT")
	private long v_contact;
	
	@Column(name = "ADDRESS")
	private String v_addr;
	
	@Column(name = "CITY")
	private String v_city;
	
	@Column(name = "EMAIL")
	private String v_email;
	
	@Column(name = "USERNAME" , unique = true)
	private String username;
	
	@Column(name = "PASSWORD" , unique = true)
	private String password;
	
	@OneToOne (targetEntity = RescueRequest.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "Resreq_fk", referencedColumnName = "r_reqid")
	private RescueRequest rescueRequest;
	
	@OneToOne (targetEntity = ShelterRequest.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "shreq_fk", referencedColumnName = "shreq_id")
	private ShelterRequest shelterRequest;
	
	@OneToOne (targetEntity = FM_Request.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "fmreq_fk", referencedColumnName = "FMreq_id")
	private FM_Request fm_Request;
	
	public Victim() {
	
	}

	public Victim(long victim_id, String v_fname, String v_lname, long v_contact, String v_addr, String v_city,
			String v_email, String username, String password, RescueRequest rescueRequest,
			ShelterRequest shelterRequest, FM_Request fm_Request) {
		super();
		this.victim_id = victim_id;
		this.v_fname = v_fname;
		this.v_lname = v_lname;
		this.v_contact = v_contact;
		this.v_addr = v_addr;
		this.v_city = v_city;
		this.v_email = v_email;
		this.username = username;
		this.password = password;
		this.rescueRequest = rescueRequest;
		this.shelterRequest = shelterRequest;
		this.fm_Request = fm_Request;
	}



	public long getVictim_id() {
		return victim_id;
	}


	public void setVictim_id(long victim_id) {
		this.victim_id = victim_id;
	}




	public String getV_fname() {
		return v_fname;
	}


	public void setV_fname(String v_fname) {
		this.v_fname = v_fname;
	}


	public String getV_lname() {
		return v_lname;
	}


	public void setV_lname(String v_lname) {
		this.v_lname = v_lname;
	}


	public long getV_contact() {
		return v_contact;
	}


	public void setV_contact(long v_contact) {
		this.v_contact = v_contact;
	}


	public String getV_addr() {
		return v_addr;
	}


	public void setV_addr(String v_addr) {
		this.v_addr = v_addr;
	}


	public String getV_city() {
		return v_city;
	}


	public void setV_city(String v_city) {
		this.v_city = v_city;
	}


	public String getV_email() {
		return v_email;
	}


	public void setV_email(String v_email) {
		this.v_email = v_email;
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

	public RescueRequest getRescueRequest() {
		return rescueRequest;
	}

	public void setRescueRequest(RescueRequest rescueRequest) {
		this.rescueRequest = rescueRequest;
	}
	

	public ShelterRequest getShelterRequest() {
		return shelterRequest;
	}

	public void setShelterRequest(ShelterRequest shelterRequest) {
		this.shelterRequest = shelterRequest;
	}

	public FM_Request getFm_Request() {
		return fm_Request;
	}

	public void setFm_Request(FM_Request fm_Request) {
		this.fm_Request = fm_Request;
	}

	@Override
	public String toString() {
		return "Victim [victim_id=" + victim_id + ", v_fname=" + v_fname + ", v_lname=" + v_lname + ", v_contact="
				+ v_contact + ", v_addr=" + v_addr + ", v_city=" + v_city + ", v_email=" + v_email + ", username="
				+ username + ", password=" + password + ", rescueRequest=" + rescueRequest + ", shelterRequest="
				+ shelterRequest + ", fm_Request=" + fm_Request + "]";
	}


  

}
