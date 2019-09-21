package com.example.Spring_Boot_Defect_Tracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring_Boot_Defect_Tracker.entity.Project;

@Repository
public interface ProjectRepositories extends JpaRepository<Project, Long> {

}
