package com.project.pharmacare.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pharmacare.entity.Doctor;




@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer> {


}