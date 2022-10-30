package com.example.demo.Services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.model.Organization;
import com.example.demo.model.Victim;
import com.example.demo.model.Volunteer;


@Service

public interface LoginService {
	
	//public ResponseEntity <Login> getLogin(String roleType,String username,String password);
	
	// Victim login
	public ResponseEntity<Victim> getVictimLogin(String username, String password); 
	
	// Organization Login
	public ResponseEntity<Organization> getOrganizationLogin(String username,String password);
	
	// Volunteer Login
	public ResponseEntity<Volunteer> getVolunteerLogin(String username,String password);



	public Login addLogin(Login login);
	
	public List<Login> getLogin();

}
