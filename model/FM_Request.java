package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="FoodMedicalRequest")
public class FM_Request {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "FMreq_id")
	   private long fm_reqid;
	   
	   @Temporal(TemporalType.DATE)
	    @Column (name = "Date")
	    private Date date = new Date(System.currentTimeMillis());
	   
	   @Column(name = "REQ_TYPE")
	    private String req_type;
	   
	   @OneToMany(targetEntity = FoodAndMedical.class, cascade = CascadeType.ALL)
		@JoinColumn(name = "FoodAndMedReq_fk", referencedColumnName = "FMreq_id")
		private List<FoodAndMedical> foodAndMedical;
	   

	public FM_Request() {
	}

	public FM_Request(long fm_reqid, Date date, String req_type, List<FoodAndMedical> foodAndMedical) {
		super();
		this.fm_reqid = fm_reqid;
		this.date = date;
		this.req_type = req_type;
		this.foodAndMedical = foodAndMedical;
	}


	public long getFm_reqid() {
		return fm_reqid;
	}





	public void setFm_reqid(long fm_reqid) {
		this.fm_reqid = fm_reqid;
	}





	public Date getDate() {
		return date;
	}





	public void setDate(Date date) {
		this.date = date;
	}





	public String getReq_type() {
		return req_type;
	}





	public void setReq_type(String req_type) {
		this.req_type = req_type;
	}





	public List<FoodAndMedical> getFoodAndMedical() {
		return foodAndMedical;
	}





	public void setFoodAndMedical(List<FoodAndMedical> foodAndMedical) {
		this.foodAndMedical = foodAndMedical;
	}





	@Override
	public String toString() {
		return "FM_Request [fm_reqid=" + fm_reqid + ", date=" + date + ", req_type=" + req_type + ", foodAndMedical="
				+ foodAndMedical + "]";
	}



	
	
   
}
