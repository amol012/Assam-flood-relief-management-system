package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.ShelterService;
import com.example.demo.model.Shelter;
import com.example.demo.model.Victim;


@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ShelterController {
	
	@Autowired               //making obj of interface which is not allowedd
	private ShelterService shelterService;
	
	@PostMapping("/shelters")  //Add Shelter Details
	public Shelter addShelter(@RequestBody Shelter shelters) {
		return this.shelterService.addShelter(shelters);
	}
	
	@GetMapping("/shelters") // get All Shelter Details
	public List<Shelter> getShelter(){	
	    return this.shelterService.getShelter();
	}
	
	//Find shelter by ID
		@RequestMapping(path = "/ShelterFindById", method = RequestMethod.POST) 
		public ResponseEntity<Shelter> getShelterById(@RequestBody Shelter shelter)   
		{ 
			long shid = shelter.getShelter_id();
			
		  return this.shelterService.getShelterById(shid);  
		}  
		
		//Delete shelter by ID
			@RequestMapping(path = "/ShelterDeleteById", method = RequestMethod.POST) 
			public ResponseEntity<Shelter> DeleteShelterById(@RequestBody Shelter shelter)   
			{ 
				long shid = shelter.getShelter_id();
				
			  return this.shelterService.deleteShelterById(shid);  
			}
	
	

}
