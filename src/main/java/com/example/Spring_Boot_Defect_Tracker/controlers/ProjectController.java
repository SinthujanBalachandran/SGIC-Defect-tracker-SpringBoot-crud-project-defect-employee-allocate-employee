
package com.example.Spring_Boot_Defect_Tracker.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_Boot_Defect_Tracker.entity.Project;
import com.example.Spring_Boot_Defect_Tracker.repositories.ProjectRepositories;

@RestController
@RequestMapping("/api/v1")
public class ProjectController {

	@Autowired
	ProjectRepositories repository;

	@PostMapping(value = "/project")
	public ResponseEntity<?> createNote(@RequestBody Project project) {
		repository.save(project);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@GetMapping("/project")
	public List<Project> getProject() {
		return repository.findAll();
	}

}
