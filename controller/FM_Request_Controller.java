package com.example.demo.controller;

import java.util.HashMap;


import java.util.List;
import java.util.Map;

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

import com.example.demo.Services.FM_RequestService;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.FM_Request;


@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class FM_Request_Controller {
	
	
	@Autowired               //making obj of interface which is not allowedd
	private FM_RequestService fm_RequestService;
	
	@PostMapping("/fmrequests")  //post method mapping for url request (/victims)
	public FM_Request addFM_Request(@RequestBody FM_Request fm_Request) {
		return this.fm_RequestService.addFM_Request(fm_Request);
	}
	
	@GetMapping("/fmrequests")
	public List<FM_Request> getFM_Request(){	
	    return this.fm_RequestService.getFM_Request();
	}

}
