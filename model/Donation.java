package com.example.demo.model;

import java.util.Date;
import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Table(name = "DONATION")
public class Donation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int donation_id;
	
	@Column(name="FIRST_NAME")
	private String d_fname;
	
	@Column(name="LAST_NAME")
	private String d_lname;
	
	@Column(name="ADDRESS")
	private String d_addr;
	
	@Column(name="City")
	private String d_city;
	
	@Column(name="CONTACT")
	private int d_contact;
	
	@Column(name="EMAIL")
	private String d_email;
	
	@Column(name="DONATION_TYPE")
	private String donation_type;
	
	@Column(name="AMOUNT")
	private int amount;
	
	@Column(name="TRANSACTION_ID")
	private int txid;
	
	@Temporal(TemporalType.DATE)
    @Column
    private Date date = new Date(System.currentTimeMillis());
	
	public Donation() {
		
	}

	public Donation(int donation_id, String d_fname, String d_lname, String d_addr, String d_city, int d_contact,
			String d_email, String donation_type, int amount, int txid, Date date) {
		super();
		this.donation_id = donation_id;
		this.d_fname = d_fname;
		this.d_lname = d_lname;
		this.d_addr = d_addr;
		this.d_city = d_city;
		this.d_contact = d_contact;
		this.d_email = d_email;
		this.donation_type = donation_type;
		this.amount = amount;
		this.txid = txid;
		this.date = date;
	}

	public int getDonation_id() {
		return donation_id;
	}

	public void setDonation_id(int donation_id) {
		this.donation_id = donation_id;
	}

	public String getD_fname() {
		return d_fname;
	}

	public void setD_fname(String d_fname) {
		this.d_fname = d_fname;
	}

	public String getD_lname() {
		return d_lname;
	}

	public void setD_lname(String d_lname) {
		this.d_lname = d_lname;
	}

	public String getD_addr() {
		return d_addr;
	}

	public void setD_addr(String d_addr) {
		this.d_addr = d_addr;
	}

	public String getD_city() {
		return d_city;
	}

	public void setD_city(String d_city) {
		this.d_city = d_city;
	}

	public int getD_contact() {
		return d_contact;
	}

	public void setD_contact(int d_contact) {
		this.d_contact = d_contact;
	}

	public String getD_email() {
		return d_email;
	}

	public void setD_email(String d_email) {
		this.d_email = d_email;
	}

	public String getDonation_type() {
		return donation_type;
	}

	public void setDonation_type(String donation_type) {
		this.donation_type = donation_type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTxid() {
		return txid;
	}

	public void setTxid(int txid) {
		this.txid = txid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Donation [donation_id=" + donation_id + ", d_fname=" + d_fname + ", d_lname=" + d_lname + ", d_addr="
				+ d_addr + ", d_city=" + d_city + ", d_contact=" + d_contact + ", d_email=" + d_email
				+ ", donation_type=" + donation_type + ", amount=" + amount + ", txid=" + txid + ", date=" + date + "]";
	}
	
	


	}


