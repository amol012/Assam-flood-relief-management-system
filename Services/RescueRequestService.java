package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.RescueRequest;

@Service
public interface RescueRequestService {
	
	RescueRequest addRescueRequest(RescueRequest rescueRequests);
	
	public List<RescueRequest> getRescueRequest(); 

}
