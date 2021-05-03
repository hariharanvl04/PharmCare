package com.project.pharmacare.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacare.entity.Doctor;
import com.project.pharmacare.entity.Prescription;
import com.project.pharmacare.service.DoctorService;
import com.project.pharmacare.service.PrescriptionService;


@RestController
@RequestMapping("/pharmcare")
public class DoctorController {
	
	@Autowired
	DoctorService service;
	@Autowired
	PrescriptionService prescription;
	 Logger logger = LoggerFactory.getLogger(DoctorController.class);

	@PostMapping("/doctor/addDoctor")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		logger.info("addDoctor Controller started");
		Doctor test = service.addDoctor(doctor);
		logger.info("addDoctor Controller ended");
		return test;

	}

	@PutMapping("/doctor/updateDoctor")
	public Doctor updateTutor(@RequestBody Doctor doctor) {
		logger.info("updateDoctor Controller Started");
		Doctor test1 = service.updateDoctor(doctor);
		logger.info("updateDoctor Controller ended");
		return test1;

	}




	@GetMapping("/doctor/viewAllDoctors")
	public List<Doctor> getAllDoctors() {
		logger.info("viewAllDoctor Controller Started");
		List<Doctor> test = service.getAllDoctors();
		logger.info("viewAllDoctor Controller ended");
		return test;
	}
	
	
	@PostMapping("/doctor/createPrescription")
	public Prescription addPrescription(@RequestBody Prescription medicine) {
		logger.info("createPrescription Controller Started");
		logger.info("createPrescription Controller ended");
		return prescription.addPrescription(medicine);
		
	
		

	}
	}