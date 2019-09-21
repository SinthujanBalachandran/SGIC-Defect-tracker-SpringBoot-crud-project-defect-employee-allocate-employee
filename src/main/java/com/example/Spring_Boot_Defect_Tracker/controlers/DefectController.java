package com.example.Spring_Boot_Defect_Tracker.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_Boot_Defect_Tracker.entity.Defect;
import com.example.Spring_Boot_Defect_Tracker.repositories.DefectRepositories;

@RestController
@RequestMapping("/api/v2")
public class DefectController {
	
	@Autowired
	DefectRepositories defectRepo;
	
	

	@GetMapping("/defect")
	public List<Defect> getDefect(){
		return defectRepo.findAll();
	}
	
}
