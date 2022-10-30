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

import com.example.demo.Services.ShelterRequestService;
import com.example.demo.model.ShelterRequest;
import com.example.demo.model.Victim;


@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ShelterRequestController {
	
	@Autowired               //making obj of interface which is not allowedd
	private ShelterRequestService shelterRequestService;
	
	@PostMapping("/ShelterRequests")  //post method mapping for url request (/volunteers)
	public ShelterRequest addShelterRequest(@RequestBody ShelterRequest shelterRequests) {
		return this.shelterRequestService.addShelterRequest(shelterRequests);
	}
	
	@GetMapping("/ShelterRequests")
	public List<ShelterRequest> getShelterRequestRequest(){	
	    return this.shelterRequestService.getShelterRequest();
	}
	
	//Find Shelter Request by ID
		@RequestMapping(path = "/ShelterReqFindById", method = RequestMethod.POST) 
		public ResponseEntity<ShelterRequest> getShelterRequestById(@RequestBody ShelterRequest shelterRequest)   
		{ 
			long shreq_id = shelterRequest.getShelter_reqid();
			
		  return this.shelterRequestService.getShelterRequestById(shreq_id);  
		}  
		
		//Delete victim by ID
			@RequestMapping(path = "/ShelterReqDeleteById", method = RequestMethod.POST) 
			public ResponseEntity<ShelterRequest> DeleteShelterRequestById(@RequestBody ShelterRequest shelterRequest)   
			{ 
				long shreq_id = shelterRequest.getShelter_reqid();
				
			  return this.shelterRequestService.deleteShelterRequestById(shreq_id);  
			} 
			


}
