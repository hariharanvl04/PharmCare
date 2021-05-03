package com.project.pharmacare.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.project.pharmacare.entity.Admin;


@Repository


	public interface AdminRepo extends JpaRepository<Admin , Integer> {
		
		public List<Admin> findByadminId(int adminId);
	}



