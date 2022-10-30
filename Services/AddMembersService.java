package com.example.demo.Services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.demo.model.AddMembers;

@Service
public interface AddMembersService {
	
	AddMembers addAddMembers(AddMembers addMember);
	
	public List<AddMembers> getAddMembers(); 

}
