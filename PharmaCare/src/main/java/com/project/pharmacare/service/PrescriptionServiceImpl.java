package com.project.pharmacare.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pharmacare.entity.Prescription;
import com.project.pharmacare.repository.PrescriptionRepo;
import com.project.pharmacare.validation.Validate;
import com.project.pharmcare.exceptions.PrescriptionException;

@Service

public class PrescriptionServiceImpl implements PrescriptionService {
	@Autowired
	private PrescriptionRepo dao;
	@Autowired
	private Validate validate;
	private Logger logger = LoggerFactory.getLogger(PrescriptionServiceImpl.class);

	@Override
	public Prescription addPrescription(Prescription prescription) {
		logger.info("addPrescription Service started");
		if (!(validate.validatePrescription(prescription))) {
			logger.warn("invalid details");
			throw new PrescriptionException("PLEASE CHECK YOUR GIVEN CREDENTIALS...");
		}
		logger.info("addPrescription Service ended");
		return dao.save(prescription);
	}

	@Override
	public Prescription updatePrescription(Prescription prescription) {
		logger.info("updatePrescription Service started");
		if (!(validate.validatePrescription(prescription))) {
			logger.warn("invalid details");
			throw new PrescriptionException("PLEASE CHECK YOUR GIVEN CREDENTIALS...");
		}
		logger.info("updatePrescription Service ended");
		return dao.save(prescription);
	}

	@Override
	public Optional<Prescription> viewPrescription(int prescriptionId) {
		logger.info("viewPrescription Service Started");
		if (!(validate.validateMedicineById(prescriptionId)))
			throw new PrescriptionException("PLEASE ENTER A VALID prescription ID...");
		else
			logger.info("viewPrescription Service ended");
		return dao.findById(prescriptionId);
	}

	@Override
	public void removePrescription(int prescriptionId) {
		logger.info("removePrescription Service Started");
		if (!(validate.validateMedicineById(prescriptionId)))
			throw new PrescriptionException("PLEASE ENTER A VALID prescription ID...");
		else
			logger.info("removePrescription Service ended");
		dao.deleteById(prescriptionId);
	}

	


}
