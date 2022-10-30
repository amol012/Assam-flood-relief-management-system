package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Rescue_Request")
public class RescueRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "r_reqid")
	private long rescue_reqid;
	
	@Temporal(TemporalType.DATE)
    @Column (name = "DATE")
    private Date date = new Date(System.currentTimeMillis());
	
	@Column(name = "COUNT_OF_PEOPLE")
    private int v_count;
		
	public RescueRequest() {
		
	}
	
	public RescueRequest(long rescue_reqid, Date date, int v_count) {
		super();
		this.rescue_reqid = rescue_reqid;
		this.date = date;
		this.v_count = v_count;
	}




	public long getRescue_reqid() {
		return rescue_reqid;
	}


	public void setRescue_reqid(long rescue_reqid) {
		this.rescue_reqid = rescue_reqid;
	}


	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public int getV_count() {
		return v_count;
	}



	public void setV_count(int v_count) {
		this.v_count = v_count;
	}


	@Override
	public String toString() {
		return "RescueRequest [rescue_reqid=" + rescue_reqid + ", date=" + date + ", v_count=" + v_count + "]";
	}	

}
