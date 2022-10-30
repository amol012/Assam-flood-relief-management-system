package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Donation;
import com.example.demo.repository.DonationRepository;

@Service
public class DonationServiceImpl implements DonationService {
	
	@Autowired
	private  DonationRepository  donationRepository;
	
	@Override
	public 	Donation addDonation(Donation donations)
 {
		
		donationRepository.save(donations);
		return donations;
	}


	@Override
	public List<Donation> getDonation() {
		
		//findall return all Individual
		return donationRepository.findAll();
		
	}



}

