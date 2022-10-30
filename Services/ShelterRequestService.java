package com.example.demo.Services;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.model.ShelterRequest;

@Service
public interface ShelterRequestService {

	ShelterRequest  addShelterRequest(ShelterRequest  shelterRequests); //Save Shelter Request
	
	 // Get ALl Shelter Request
	public List<ShelterRequest> getShelterRequest (); 
	
	// Find  Shelter Request By Id 
	public ResponseEntity<ShelterRequest> getShelterRequestById(long sh_id);
	
	
	// Delete  Shelter Request By Id 
	public ResponseEntity<ShelterRequest> deleteShelterRequestById(long shreq_id); 

	
}
 