package com.example.Spring_Boot_Defect_Tracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring_Boot_Defect_Tracker.entity.Defect;

@Repository
public interface DefectRepositories extends JpaRepository<Defect, Long> {

}
