package com.example.demo.Services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.demo.model.FoodAndMedical;

@Service
public interface FoodAndMedicalService {
	
	FoodAndMedical addFoodAndMedical(FoodAndMedical medicals);
	
	public List<FoodAndMedical> getFoodAndMedical(); 

}

