package com.example.demo.Services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Volunteer;

@Service
public interface VolunteerService {
	
	public Volunteer addVolunteer(Volunteer Volunteers);
	
	public List<Volunteer> getVolunteer();
		
	public ResponseEntity<Volunteer> getVolunteer(String name,String password);


}
