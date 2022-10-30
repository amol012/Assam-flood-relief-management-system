package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Shelter")
public class Shelter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sh_id")
	private long shelter_id;
	
	@Column(name = "Name")
    private String sh_name;
	
	@Column(name = "Address")
    private String sh_addr;
	
	@Column(name = "City")
    private String sh_city;
	
	@Column(name = "Email")
    private String sh_email;
	
	@Column(name = "Contact")
    private String sh_cont;
	
    public Shelter()
    {
    	
    }

	public Shelter(long shelter_id, String sh_name, String sh_addr, String sh_city, String sh_email, String sh_cont) {
		super();
		this.shelter_id = shelter_id;
		this.sh_name = sh_name;
		this.sh_addr = sh_addr;
		this.sh_city = sh_city;
		this.sh_email = sh_email;
		this.sh_cont = sh_cont;
	}

	public long getShelter_id() {
		return shelter_id;
	}

	public void setShelter_id(long shelter_id) {
		this.shelter_id = shelter_id;
	}

	public String getSh_name() {
		return sh_name;
	}

	public void setSh_name(String sh_name) {
		this.sh_name = sh_name;
	}

	public String getSh_addr() {
		return sh_addr;
	}

	public void setSh_addr(String sh_addr) {
		this.sh_addr = sh_addr;
	}

	public String getSh_city() {
		return sh_city;
	}

	public void setSh_city(String sh_city) {
		this.sh_city = sh_city;
	}

	public String getSh_email() {
		return sh_email;
	}

	public void setSh_email(String sh_email) {
		this.sh_email = sh_email;
	}

	public String getSh_cont() {
		return sh_cont;
	}

	public void setSh_cont(String sh_cont) {
		this.sh_cont = sh_cont;
	}

	@Override
	public String toString() {
		return "Shelter [shelter_id=" + shelter_id + ", sh_name=" + sh_name + ", sh_addr=" + sh_addr + ", sh_city="
				+ sh_city + ", sh_email=" + sh_email + ", sh_cont=" + sh_cont + "]";
	}



    
}
