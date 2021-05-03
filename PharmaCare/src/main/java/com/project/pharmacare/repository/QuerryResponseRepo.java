package com.project.pharmacare.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pharmacare.entity.QuerryResponse;



@Repository
public interface QuerryResponseRepo extends JpaRepository<QuerryResponse, Integer> {

	QuerryResponse save(Optional<QuerryResponse> uquerry);


}