package com.project.pharmacare.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pharmacare.entity.Prescription;


@Repository


	public interface PrescriptionRepo extends JpaRepository<Prescription , Integer> {

	
		
		
	}



