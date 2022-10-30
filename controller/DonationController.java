package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.DonationService;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Donation;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class DonationController {
	
	
	@Autowired        //making obj of interface which is not allowedd
	private DonationService donationService;
	
	@PostMapping("/donations")  //post method mapping for url request (/individuals)
	public Donation addDonation(@RequestBody Donation donations) {
		return this.donationService.addDonation(donations);
	}
	
	@GetMapping("/donations")
	public List<Donation> getDonation(){	
	    return this.donationService.getDonation();
	}
}

			
		

