package com.example.demo.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.ShelterRequest;
import com.example.demo.model.Victim;
import com.example.demo.repository.ShelterRequestRepository;

@Service
public class ShelterRequestServiceImpl implements ShelterRequestService {
	
	@Autowired
	private ShelterRequestRepository shelterRequestRepository;
	
	@Override
	public ShelterRequest addShelterRequest(ShelterRequest shelterRequests) {
		
		shelterRequestRepository.save(shelterRequests);
		return shelterRequests;
	}
	
	@Override 

	public List<ShelterRequest> getShelterRequest() {
		
		return shelterRequestRepository.findAll();
		//findAll()  returns all ShelterRequest
	}
	
	// ShelterRequest Find by ID
	public ResponseEntity<ShelterRequest> getShelterRequestById(long sh_id )
	{
		ShelterRequest shelterRequest = shelterRequestRepository.findById(sh_id)
		    	.orElseThrow(() -> new ResourceNotFoundException("Shelter Request does not exit with id: " + sh_id));
				return ResponseEntity.ok(shelterRequest);
	}
	
	// ShelterRequest Delete by ID
	public ResponseEntity<ShelterRequest> deleteShelterRequestById(long sh_id )
	{
		ShelterRequest shelterRequest = shelterRequestRepository.findById(sh_id)
		    	.orElseThrow(() -> new ResourceNotFoundException("Shelter Request does not exit with id: " + sh_id));
				
				shelterRequestRepository.delete(shelterRequest); 
				
				return ResponseEntity.ok(shelterRequest);


	}
}


