package com.project.pharmacare.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pharmacare.entity.Medicine;


@Repository


	public interface MedicineRepo extends JpaRepository<Medicine , Integer> {
		
		
	}



