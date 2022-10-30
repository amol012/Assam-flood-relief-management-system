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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Shelter_Request")
public class ShelterRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shreq_id")
	private long shelter_reqid;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE")
    private Date date = new Date(System.currentTimeMillis());
	
	@OneToOne (targetEntity = Shelter.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "shelter_fk", referencedColumnName = "sh_id")
	private Shelter shelter;
	
	@OneToMany(targetEntity = AddMembers.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "shelterReq_fk", referencedColumnName = "shreq_id")
	private List<AddMembers> AddMembers;
	
	
	public ShelterRequest() {
	}


	public ShelterRequest(long shelter_reqid, Date date, Shelter shelter,
			List<com.example.demo.model.AddMembers> addMembers) {
		super();
		this.shelter_reqid = shelter_reqid;
		this.date = date;
		this.shelter = shelter;
		AddMembers = addMembers;
	}


	public long getShelter_reqid() {
		return shelter_reqid;
	}


	public void setShelter_reqid(long shelter_reqid) {
		this.shelter_reqid = shelter_reqid;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Shelter getShelter() {
		return shelter;
	}


	public void setShelter(Shelter shelter) {
		this.shelter = shelter;
	}


	public List<AddMembers> getAddMembers() {
		return AddMembers;
	}


	public void setAddMembers(List<AddMembers> addMembers) {
		AddMembers = addMembers;
	}


	@Override
	public String toString() {
		return "ShelterRequest [shelter_reqid=" + shelter_reqid + ", date=" + date + ", shelter=" + shelter
				+ ", AddMembers=" + AddMembers + "]";
	}
	
	
	
	
	

	





}
