package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.RescueRequest;
import com.example.demo.repository.RescueRequestRepository;



@Service
public class RescueRequestServiceImpl  implements RescueRequestService {
	
	@Autowired
	private RescueRequestRepository rescueRequestRepository;
	
	
	@Override
	public RescueRequest addRescueRequest(RescueRequest rescueRequests) {
		
		rescueRequestRepository.save(rescueRequests);
		return rescueRequests;
	}


	@Override
	public List<RescueRequest> getRescueRequest() {
		
		//findall o return all Organization
		return rescueRequestRepository.findAll();
		
	}

	

}
