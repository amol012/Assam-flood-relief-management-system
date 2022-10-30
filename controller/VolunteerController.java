package com.example.demo.controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.VolunteerService;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Victim;
import com.example.demo.model.Volunteer;
import com.example.demo.repository.VolunteerRepository;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class VolunteerController {
	
	@Autowired               //making obj of interface which is not allowedd
	private VolunteerService volunteerService;
	
	@PostMapping("/volunteers")  //post method mapping for url request (/volunteers)
	public Volunteer addVolunteer(@RequestBody Volunteer volunteers) {
		return this.volunteerService.addVolunteer(volunteers);
	}
	
	@GetMapping("/volunteers")
	public List<Volunteer> getVolunteer(){	
	    return this.volunteerService.getVolunteer();
	}
	
	// Login Method
		@RequestMapping(path = "/Volunteerlogin", method = RequestMethod.POST) 
		public ResponseEntity<Volunteer> getVolunteerLogin(@RequestBody Volunteer volunteer)
		{
			String name = volunteer.getUsername();
			String password = volunteer.getPassword();
			System.out.println(name);
			return this.volunteerService.getVolunteer(name,password);
		}
		
}
