package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.Services.LoginService;
import com.example.demo.model.Login;
import com.example.demo.model.Victim;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class LoginController {
	
	@Autowired               
	private LoginService loginService;
	
	@RequestMapping("/logins")  
	public Login addLogin(@RequestBody Login login) {
	
		return this.loginService.addLogin(login);
	}
	
	@GetMapping("/logins") 
	public List<Login> getLogin(){	
	    return this.loginService.getLogin();
	}

	
	// Login Method
	@RequestMapping(path = "/login", method = RequestMethod.POST) 
	public ResponseEntity<?> getLogin(@RequestBody  Login  login)
	{
		String roleType = login.getRoleType();
		String username = login.getUsername();
		String password = login.getPassword();
		

		
		if  (roleType.equals("victim"))
		{
			return this.loginService.getVictimLogin(username,password);
		}
		else if (roleType.equals("organization"))
		{
			return this.loginService.getOrganizationLogin(username,password);
		}
		
		else
		{
			return this.loginService.getVolunteerLogin(username,password);
		}
		

		
	}
	


}
