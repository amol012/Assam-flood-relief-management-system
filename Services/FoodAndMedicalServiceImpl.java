package com.example.demo.Services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FoodAndMedical;
import com.example.demo.repository.FoodAndMedicalRepository;

@Service
public class FoodAndMedicalServiceImpl implements FoodAndMedicalService {
	
	
	@Autowired
	private FoodAndMedicalRepository fmRepository;
	
	@Override
	public FoodAndMedical addFoodAndMedical(FoodAndMedical medicals) {
		
		fmRepository.save(medicals);
		return medicals;
	}


	@Override
	public List<FoodAndMedical> getFoodAndMedical() {
		
		//findall return all Medical
		return fmRepository.findAll();
		
	}

}
