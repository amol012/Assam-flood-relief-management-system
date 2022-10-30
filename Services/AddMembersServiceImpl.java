package com.example.demo.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AddMembers;
import com.example.demo.repository.AddMembersRepository;

@Service
public class AddMembersServiceImpl implements AddMembersService {

	@Autowired
	private AddMembersRepository addMemberRepository;
	
	@Override
	public AddMembers addAddMembers(AddMembers addMember) {
		addMemberRepository.save(addMember);
		return addMember;
	}

	@Override
	public List<AddMembers> getAddMembers() {
		return addMemberRepository.findAll();
	}
	

}

