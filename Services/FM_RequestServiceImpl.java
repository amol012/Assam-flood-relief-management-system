package com.example.demo.Services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FM_Request;
import com.example.demo.repository.FM_RequestRepository;

@Service
public class FM_RequestServiceImpl implements FM_RequestService {

	@Autowired
	private FM_RequestRepository fm_RequestRepository;
	
	@Override
	public FM_Request addFM_Request(FM_Request fm_Request) {
		
		fm_RequestRepository.save(fm_Request);
		return fm_Request;
	}


	@Override
	public List<FM_Request> getFM_Request() {
		
		//findall return all Medical
		return fm_RequestRepository.findAll();

    }
}
