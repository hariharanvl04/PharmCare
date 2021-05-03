package com.project.pharmacare.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pharmacare.entity.Patient;
import com.project.pharmacare.repository.PatientRepo;
import com.project.pharmacare.validation.Validate;
import com.project.pharmcare.exceptions.PatientException;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepo dao;

	@Autowired
	private Validate validate;
	private Logger logger = LoggerFactory.getLogger(PatientServiceImpl.class);

	@Override
	public Patient addPatient(Patient patient) {
		logger.info("addpatient Service started");
		if (!(validate.validatePatient(patient)))
			throw new PatientException("PLEASE ENTER ONLY ALPHABETS FOR patient'S NAME...");
		else
			logger.info("addpatient Service ended");
		return dao.save(patient);
	}

	@Override
	public Patient updatePatient(Patient patient) {
		if (!(validate.validatePatient(patient)))
			throw new PatientException("PLEASE ENTER ONLY ALPHABETS FOR patient'S NAME...");
		else
			logger.info("addpatient Service ended");
		return dao.save(patient);
	}

	@Override
	public void removePatient(int patientId) {
		logger.info("viewpatient Service Started");
		if (!(validate.validatePatientById(patientId)))
			throw new PatientException("PLEASE ENTER A VALID patient ID...");
		else
			logger.info("viewpatient Service ended");
		dao.deleteById(patientId);
	}

	@Override
	public List<Patient> viewAllPatient() {

		return dao.findAll();
	}

	@Override
	public Optional<Patient> findById(int patientId) {
		logger.info("viewpatient Service Started");
		if (!(validate.validatePatientById(patientId)))
			throw new PatientException("PLEASE ENTER A VALID PATIENT ID...");
		else
			logger.info("viewpatient Service ended");
		return dao.findById(patientId);
	}

}
