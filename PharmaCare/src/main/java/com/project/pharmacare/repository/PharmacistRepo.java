package com.project.pharmacare.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.project.pharmacare.entity.Pharmacist;


@Repository
public interface PharmacistRepo extends JpaRepository<Pharmacist , Integer> {
		
		public Pharmacist findByPharmaEmail(String email);
		
        }


