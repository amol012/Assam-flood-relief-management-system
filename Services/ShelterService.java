package com.example.demo.Services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.model.Shelter;

@Service
public interface ShelterService {
	
	Shelter addShelter(Shelter shelters);
	
	public List<Shelter> getShelter(); 
	
    public ResponseEntity<Shelter> getShelterById(long vid); // Find by Id	
	
	public ResponseEntity<Shelter> deleteShelterById(long vid); // Delete by Id	

}
