package com.project.pharmacare.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacare.entity.Patient;
import com.project.pharmacare.service.PatientService;

@RestController
@RequestMapping("/pharmacare")

public class PatientController {
	@Autowired
	private PatientService service;
	
	
	
	
	Logger logger = LoggerFactory.getLogger(PatientController.class);
	@PostMapping("/patient/addPatient")
	public Patient addPatient(@RequestBody Patient patient) {
		logger.info("addPatient Controller started");
		logger.info("addPatient Controller ended");
		return service.addPatient(patient);
		
	}

	@PutMapping("/patient/updatePatient")
	public Patient updatePatient(@RequestBody Patient patient) {
		logger.info("updatePatient Controller started");
		logger.info("updatePatient Controller ended");
		return service.updatePatient(patient);
		
	}

	@DeleteMapping("/patient/deletePatient/{id}")
	public void deletePatient(@PathVariable("id") int patientId) {
		logger.info("deletePatientById Controller started");
		service.removePatient(patientId);
		logger.info("deletePatientById Controller ended");
	}

	@GetMapping("/patient/getPatientById/{id}")
	public Optional<Patient> getPatientgById(@PathVariable("id") int id) {
		logger.info("getPatientById Controller started");
		Optional<Patient> test = service.findById(id);
		logger.info("getPatientById Controller ended");
		return test;
	}


	

}
