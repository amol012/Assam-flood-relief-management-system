package com.example.demo.Services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.demo.model.Donation;

@Service
public interface DonationService {

	Donation addDonation(Donation donations);
	
	public List<Donation> getDonation(); 
}
