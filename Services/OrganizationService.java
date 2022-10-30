package com.example.demo.Services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Organization;

@Service
public interface OrganizationService {
	
	public Organization addOrganization(Organization organization);
	
	public List<Organization> getAllOrganization(); 
		
	public ResponseEntity<Organization> getOrganization(String name,String password); //login

}
