package com.project.pharmacare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pharmacare.entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
