package com.example.demo.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Organization;
import com.example.demo.Services.OrganizationService;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin
@Service
public class OrganizationController {
	@Autowired               
	private OrganizationService organizationService;
	
	@PostMapping("/organizations")  //post method mapping for url request (/victims)
	public Organization addOrganization(@RequestBody Organization organizations) {
		return this.organizationService.addOrganization(organizations);
	}
	
	@GetMapping("/organizations")
	public List<Organization> getAllOrganization(){	
	    return this.organizationService.getAllOrganization();
	}
	
	// Login Method
		@RequestMapping(path = "/Organizationlogin", method = RequestMethod.POST) 
		public ResponseEntity<Organization> getOrganizationLogin(@RequestBody Organization organization)
		{
			String name = organization.getUsername();
			String password = organization.getPassword();
			System.out.println(name);
			return this.organizationService.getOrganization(name,password);
		}
		
}

