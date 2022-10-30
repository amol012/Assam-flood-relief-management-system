package com.example.demo.Services;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.exception.ResourceNotFoundException;

import com.example.demo.model.AddMembers;
import com.example.demo.model.FM_Request;
import com.example.demo.model.FoodAndMedical;
import com.example.demo.model.RescueRequest;
import com.example.demo.model.Shelter;
import com.example.demo.model.ShelterRequest;
import com.example.demo.model.Victim;
import com.example.demo.repository.ShelterRepository;
import com.example.demo.repository.ShelterRequestRepository;
import com.example.demo.repository.VictimRepository;

@Service
public class VictimServiceImpl implements VictimService {
	
	@Autowired
	private VictimRepository victimRepository;
	
	@Autowired
	public ShelterRepository shelterRepository;
	
	@Autowired
	public ShelterRequestRepository shelterRequestRepository;
	
	
	@Override
	public Victim addVictim(Victim victims) {
		
		victimRepository.save(victims);
		return victims;
	}

	@Override
	public List<Victim> getVictim() 
	//find all o return all vicitms
	{		
		return victimRepository.findAll();
		
	}
	 
	    @Override // Find By ID
		public ResponseEntity<Victim> getVictimById(long vid)
		{
	    	Victim victim = victimRepository.findById(vid)
	    	.orElseThrow(() -> new ResourceNotFoundException("Victim does not exit with id: " + vid));
			return ResponseEntity.ok(victim);
}
	    
	    @Override // Delete By ID
		public ResponseEntity<Victim> deleteVictimById(long vid)
		{
	    	Victim victim = victimRepository.findById(vid)
	    	.orElseThrow(() -> new ResourceNotFoundException("Victim does not exit with id: " + vid));
	    	
	    	victimRepository.delete(victim); 
	    	
			return ResponseEntity.ok(victim); 
}
	    
		@Override 
		public List<Victim> find()
		{
			List<Victim> listVictim = new ArrayList<>();
			listVictim = victimRepository.findAll();
			return listVictim;
		}


		@Override //Login
		public ResponseEntity<Victim> getUsername(String vname,String vpass)
		{
			//Victim victim = new Victim();
			Victim victim = victimRepository.getVictimByName(vname,vpass)
			   .orElseThrow(() -> new ResourceNotFoundException("Bad Credential "));

			return ResponseEntity.ok(victim);
		}
		
		// Victim Rescue Request
		public ResponseEntity<Victim> rescueReq(long vid,int count)// Victim victims
		{
			Victim victim = victimRepository.findById(vid)
			.orElseThrow(() -> new ResourceNotFoundException("Victim does not exit with id: " + vid));
			
		   // victim.setV_addr(victims.getV_addr());
			RescueRequest resreq = new RescueRequest();
			resreq.setV_count(count);
			victim.setRescueRequest(resreq);
									
			Victim updatedVictim = victimRepository.save(victim);
		return ResponseEntity.ok(updatedVictim);

		}
		
		// Details of victim and rescue req
		public List<Victim> getDetailsOfRescuerequest()
		{
			List<Victim> listVictim = new ArrayList<>();
			listVictim = victimRepository.getDetailsOfRescuerequest();
			return listVictim;
		}
		
		ShelterRequest shreq = new ShelterRequest();

		
		 // ShelterReq
		public ResponseEntity<Victim> ShelterReq(long vid,long sh_id)
		{
			Victim victim = victimRepository.findById(vid)
					.orElseThrow(() -> new ResourceNotFoundException("Victim does not exit with id: " + vid));
					
			
			// find shelter details by shelter ID --> sh_id
			Shelter sh = shelterRepository.findById(sh_id)
					.orElseThrow(() -> new ResourceNotFoundException("Shelter does not exit with id: " + sh_id));
			
			// set shelterDetails --> sh in ShelterRequest obj --> shreq
			   shreq.setShelter(sh);
			   victim.setShelterRequest(shreq);
																
					Victim updatedVictim = victimRepository.save(victim);
				return ResponseEntity.ok(updatedVictim);
		}
		
		
		// Add Members in shelter Request
		public ResponseEntity<Victim> AddMember(long vid,long shreq_id,Victim victims)
		{
			Victim victim = victimRepository.findById(vid)
					.orElseThrow(() -> new ResourceNotFoundException("Victim does not exit with id: " + vid));
			
			               shelterRequestRepository.findById(shreq_id)
					.orElseThrow(() -> new ResourceNotFoundException("Shelter Request does not exit with id: " + shreq_id));
						
			List<AddMembers> AddMembers = victims.getShelterRequest().getAddMembers();
				
			victim.getShelterRequest().setAddMembers(AddMembers);
			
			
			Victim updatedVictim = victimRepository.save(victim);
			return ResponseEntity.ok(updatedVictim);
			
		}
				
		
		// Details of victims ShelterRequest , Shelter and AddMembers request
				public List<Victim> getDetailsOfShelterrequest()
				{
					List<Victim> listVictim = new ArrayList<>();
					listVictim = victimRepository.getDetailsOfShelterrequest();
					return listVictim;
				}
		
				 // Food And Medical Req
				FM_Request fmreq = new FM_Request();


			   public  ResponseEntity<Victim> FoodAndmedicalRequest(long vid,Victim victims)
			   {
				   Victim victim = victimRepository.findById(vid)
							.orElseThrow(() -> new ResourceNotFoundException("Victim does not exit with id: " + vid));
							
				   List<FoodAndMedical> fmRequest = victims.getFm_Request().getFoodAndMedical();
				   
				        String type =  victims.getFm_Request().getReq_type();
				        
				        fmreq.setReq_type(type);
				   
				           fmreq.setFoodAndMedical(fmRequest);
							victim.setFm_Request(fmreq);
								
							
							Victim updatedVictim = victimRepository.save(victim);
						return ResponseEntity.ok(updatedVictim);
			   }
			   
			// Details of victims and Food&Medical request
				public List<Victim> getDetailsOfFoodMedicalrequest()
				{
					List<Victim> listVictim = new ArrayList<>();
					listVictim = victimRepository.getDetailsOfFoodAndmedicalrequest();
					return listVictim;
				}

	    
		}
