package com.project.pharmacare.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pharmacare.entity.CallPatient;



@Repository
public interface CallPatientRepo extends JpaRepository<CallPatient, Integer> {

	Optional<CallPatient> findBycallId(int id);


}