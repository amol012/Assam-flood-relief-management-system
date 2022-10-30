package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.RescueRequestService;
import com.example.demo.model.RescueRequest;


@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class RescueRequestController {
	
	@Autowired               //making obj of interface which is not allowedd
	private RescueRequestService rescueRequestService;
	
	@PostMapping("/rescueRequests")  //post method mapping for url request (/volunteers)
	public RescueRequest addRescueRequest(@RequestBody RescueRequest rescueRequests) {
		return this.rescueRequestService.addRescueRequest(rescueRequests);
	}
	
	@GetMapping("/rescueRequests")
	public List<RescueRequest> getRescueRequest(){	
	    return this.rescueRequestService.getRescueRequest();
	}

}
