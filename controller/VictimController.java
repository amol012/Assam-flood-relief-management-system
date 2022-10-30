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
import com.example.demo.Services.VictimService;
import com.example.demo.model.Victim;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class VictimController {
	
	@Autowired               //making obj of interface which is not allowedd
	private VictimService victimService;
	
	@PostMapping("/victims")  // save victim details
	public Victim addVictim(@RequestBody Victim victims) {
		return this.victimService.addVictim(victims);
	}
	
	@GetMapping("/victims") // display details of victim
	public List<Victim> getVictim(){	
	    return this.victimService.getVictim();
	}

	@GetMapping("/find") // Get all user by query
	public List<Victim> find()
	{
		return this.victimService.find();
	}
	
	//Find victim by ID
	@RequestMapping(path = "/FindById", method = RequestMethod.POST) 
	public ResponseEntity<Victim> getVictimById(@RequestBody Victim victim)   
	{ 
		long vid = victim.getVictim_id();
		
	  return this.victimService.getVictimById(vid);  
	}  
	
	//Delete victim by ID
		@RequestMapping(path = "/DeleteById", method = RequestMethod.POST) 
		public ResponseEntity<Victim> DeleteVictimById(@RequestBody Victim victim)   
		{ 
			long vid = victim.getVictim_id();
			
		  return this.victimService.deleteVictimById(vid);  
		}  
	
	// Login Method
	@RequestMapping(path = "/Victimlogin", method = RequestMethod.POST) 
	public ResponseEntity<Victim> getVictimLogin(@RequestBody Victim victim)
	{
		String vname = victim.getUsername();
		String vpass = victim.getPassword();
		System.out.println(vname);
		return this.victimService.getUsername(vname,vpass);
	}
	
	@RequestMapping(path = "/rescueReq", method = RequestMethod.POST) // Resecue Request
	public ResponseEntity <Victim> updateVictim(@RequestBody Victim victims)
	{
		long vid = victims.getVictim_id();
		
		System.out.println(victims.getRescueRequest().getV_count());
		
		int count = victims.getRescueRequest().getV_count();
		System.out.println(count);
		
	return this.victimService.rescueReq(vid,count);
	
	}
	
	              // Choosing Shelter 
		@RequestMapping(path = "/ShelterReq", method = RequestMethod.POST) 
				public ResponseEntity <Victim> ShelterRequest(@RequestBody Victim victims)
				{
					long vid = victims.getVictim_id();					
					long sh_id = victims.getShelterRequest().getShelter().getShelter_id();
					
					System.out.println(vid);
					System.out.println(sh_id);
					
				return this.victimService.ShelterReq(vid,sh_id);
				
			   }
				
				// Add Member Details To shelter Request 
				@RequestMapping(path = "/AddMembertoShelterRequest", method = RequestMethod.POST) 
				public ResponseEntity <Victim> AddMembertoShelterRequest(@RequestBody Victim victims)
				{
					long vid = victims.getVictim_id();
										
					long sh_id = victims.getShelterRequest().getShelter().getShelter_id();
					
					System.out.println(vid);
					System.out.println(sh_id);
					
					long shreq_id = victims.getShelterRequest().getShelter_reqid();
					
					System.out.println(shreq_id);					
					
					
				return this.victimService.AddMember(vid,shreq_id,victims);
				
			}
				
				
				
				// Food & Medical Request 
				@RequestMapping(path = "/FMRequest", method = RequestMethod.POST) 
				public ResponseEntity <Victim> FoodAndmedicalRequest(@RequestBody Victim victims)
				{
					long vid = victims.getVictim_id();
															
					System.out.println(vid);										
					
				return this.victimService.FoodAndmedicalRequest(vid,victims);
				
			}
				
				
				
				
				
	
	// Resecue Request Details

	@RequestMapping(path = "/RescueDetails", method = RequestMethod.GET) 
	public List<Victim> getDetailOfRescuerequest()
	{	
		return this.victimService.getDetailsOfRescuerequest();
	}
	
	
	
	// Shelter Request Details

		@RequestMapping(path = "/ShelterDetails", method = RequestMethod.GET) 

		public List<Victim> getDetailOfShelterrequest()
		{	
			return this.victimService.getDetailsOfShelterrequest();
		}
		
		// Food&Medical Request Details

				@RequestMapping(path = "/FoodMedicalDetails", method = RequestMethod.GET) 

				public List<Victim> getDetailOfFoodMedicalequest()
				{	
					return this.victimService.getDetailsOfFoodMedicalrequest();
				}

	
		
}
