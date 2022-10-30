package com.example.demo.Services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.demo.model.FM_Request;


@Service
public interface FM_RequestService {

		
		FM_Request addFM_Request(FM_Request fm_Requestrequest);
		
		public List<FM_Request> getFM_Request(); 

}
