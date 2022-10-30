package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Shelter;
import com.example.demo.model.Victim;
import com.example.demo.repository.ShelterRepository;


@Service
public class ShelterServiceImpl implements  ShelterService{

	
	@Autowired
	  private  ShelterRepository  shelterRepository;


	@Override
	public 	Shelter addShelter(Shelter shelters)
 {
		
		shelterRepository.save(shelters);
		return shelters;
	}
	@Override
	public List<Shelter> getShelter() {
		
		//findall return all Individual
		return shelterRepository.findAll();
		
	}
	
	  @Override // Find By ID
			public ResponseEntity<Shelter> getShelterById(long shid)
			{
		  Shelter shelter = shelterRepository.findById(shid)
		    	.orElseThrow(() -> new ResourceNotFoundException("Shelter does not exit with id: " + shid));
				return ResponseEntity.ok(shelter);
	}
		    
		    @Override // Delete By ID
			public ResponseEntity<Shelter> deleteShelterById(long shid)
			{
		    	Shelter shelter = shelterRepository.findById(shid)
		    	.orElseThrow(() -> new ResourceNotFoundException("Shelter does not exit with id: " + shid));
		    	
		    	shelterRepository.delete(shelter); 
		    	
				return ResponseEntity.ok(shelter); 
	}




}
