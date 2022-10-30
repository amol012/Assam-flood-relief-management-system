package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.AddMembersService;
import com.example.demo.model.AddMembers;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class AddMembersController {
	
	@Autowired              
	private AddMembersService addMemberService;
	
	@PostMapping("/AddMembers")  
	public AddMembers addAddMembers(@RequestBody AddMembers addMember) {
		return this.addMemberService.addAddMembers(addMember);
	}
	
	@GetMapping("/AddMembers")
	public List<AddMembers> getAddMembers(){	
	    return this.addMemberService.getAddMembers();
	}
	
	
	
	

}
