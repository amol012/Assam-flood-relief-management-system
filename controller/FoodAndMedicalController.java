package com.example.demo.controller;
import java.util.HashMap;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.FoodAndMedicalService;
import com.example.demo.Services.VictimService;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.FoodAndMedical;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class FoodAndMedicalController {
	
	@Autowired               //making obj of interface which is not allowedd
	private FoodAndMedicalService fmService;
	
	
	@PostMapping("/foodAndmedicals")  //post method mapping for url request (/medicals)
	public FoodAndMedical addMedical(@RequestBody FoodAndMedical medicals) {
		return this.fmService.addFoodAndMedical(medicals);
	}
	
	@GetMapping("/foodAndmedicals")
	public List<FoodAndMedical> getFoodAndMedical(){	
	    return this.fmService.getFoodAndMedical();
	}

			
}
			

