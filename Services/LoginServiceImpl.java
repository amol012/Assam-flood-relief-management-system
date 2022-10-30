package com.example.demo.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Login;
import com.example.demo.model.Organization;
import com.example.demo.model.Victim;
import com.example.demo.model.Volunteer;
import com.example.demo.repository.LoginRepository;
import com.example.demo.repository.OrganizationRepository;
import com.example.demo.repository.VictimRepository;
import com.example.demo.repository.VolunteerRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Autowired
	private VictimRepository victimRepository;
	
	@Autowired
	private OrganizationRepository organizationRepository;
	
	@Autowired
	private VolunteerRepository volunteerRepository;
	
	
	@Override
	public Login addLogin(Login login) {
		
		loginRepository.save(login);
		return login;
	}
	

	@Override
	public List<Login> getLogin() {
		
		//findAll return all volunteers
		return loginRepository.findAll();
		
	}
	
	
	@Override // VictimLogin
	public ResponseEntity<Victim> getVictimLogin(String username,String password)
	{
		Victim victim = victimRepository.findByUsernameAndPassword(username, password)
			.orElseThrow(() -> new ResourceNotFoundException("Wrong Credentials "));
		
		System.out.println(victim.getUsername());

		System.out.println(victim.getPassword());

		return ResponseEntity.ok(victim);	}
	
	@Override //Organization login
	public ResponseEntity<Organization> getOrganizationLogin(String username,String password)
	{
		Organization organization = organizationRepository.getOrganization(username, password)
			.orElseThrow(() -> new ResourceNotFoundException("Wrong Credentials "));
		
		System.out.println(organization.getUsername());

		System.out.println(organization.getPassword());

		return ResponseEntity.ok(organization);	}
	
	
	@Override //Volunteer login
	public ResponseEntity<Volunteer> getVolunteerLogin(String username,String password)
	{
		Volunteer volunteer = volunteerRepository.getVolunteer(username, password)
			.orElseThrow(() -> new ResourceNotFoundException("Wrong Credentials "));
		
		System.out.println(volunteer.getUsername());

		System.out.println(volunteer.getPassword());

		return ResponseEntity.ok(volunteer);	}

	

	
	
}
