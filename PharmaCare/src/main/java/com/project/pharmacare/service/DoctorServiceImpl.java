package com.project.pharmacare.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pharmacare.entity.Doctor;
import com.project.pharmacare.repository.DoctorRepo;
import com.project.pharmacare.validation.Validate;
import com.project.pharmcare.exceptions.DoctorException;

@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	DoctorRepo dao;
	@Autowired
	private Validate validate;

	private Logger logger = LoggerFactory.getLogger(DoctorServiceImpl.class);

	@Override
	public Doctor addDoctor(Doctor doctor) {
		logger.info("addDoctor Service started");
		if (!(validate.validateDoctor(doctor)))
			throw new DoctorException("PLEASE ENTER ONLY ALPHABETS FOR DOCTOR'S NAME...");
		else
			logger.info("addDoctor Service ended");
		return dao.save(doctor);

	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		logger.info("updateDoctor Service started");
		if (!(validate.validateDoctor(doctor)))
			throw new DoctorException("PLEASE ENTER ONLY ALPHABETS FOR DOCTOR'S NAME...");
		else
			logger.info("updateDoctor Service ended");
		return dao.save(doctor);
	}

	@Override
	public Optional<Doctor> getDoctorById(int doctorId) {
		logger.info("getDoctorById Service started");
		if (!(validate.validateDoctorById(doctorId)))
			throw new DoctorException("PLEASE ENTER A VALID DOCTOR ID...");
		else
			logger.info("getDoctorById Service ended");
		return dao.findById(doctorId);
	}

	@Override
	public void deleteDoctorById(int doctorId) {
		logger.info("deleteDoctorById Service started");
		if (!(validate.validateDoctorById(doctorId)))
			throw new DoctorException("PLEASE ENTER A VALID DOCTOR ID...");
		else
			logger.info("deleteDoctorById Service ended");
		dao.deleteById(doctorId);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		logger.info("getAllDoctor Service Started");
		logger.info("getAllDoctor Service ended");
		return dao.findAll();
	}

}
