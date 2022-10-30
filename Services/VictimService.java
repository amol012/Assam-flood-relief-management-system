package com.example.demo.Services;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Victim;

@Service
public interface VictimService {
	
	Victim addVictim(Victim victims); //registration (add victim)
	
    List<Victim> getVictim(); // Display (Get victim)
		    
	ResponseEntity<Victim> getVictimById(long vid); // Find by Id	
	
	ResponseEntity<Victim> deleteVictimById(long vid); // Delete by Id	
	
	List<Victim> find(); //find victim by userdefied query
	 
	ResponseEntity<Victim> getUsername(String vname, String vpass); // login
	
   // RescueReq
    ResponseEntity<Victim>  rescueReq(long vid,int count);
    
    // ShelterReq
    ResponseEntity<Victim> ShelterReq(long vid,long sh_id);
    
    ResponseEntity<Victim> AddMember(long vid,long sh_id,Victim victims);
    
    // Food & Medical Request
    ResponseEntity<Victim> FoodAndmedicalRequest(long vid,Victim victims);
     
    List<Victim> getDetailsOfRescuerequest(); // All Details Rescue Resquest 
    
    List<Victim> getDetailsOfShelterrequest(); // All Details Shelter Resquest 
    
    List<Victim> getDetailsOfFoodMedicalrequest(); // All Details FoodMedical Resquest 


	
	
}
