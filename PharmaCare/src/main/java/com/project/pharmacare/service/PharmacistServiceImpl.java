package com.project.pharmacare.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pharmacare.entity.Pharmacist;
import com.project.pharmacare.repository.PharmacistRepo;
import com.project.pharmacare.validation.Validate;
import com.project.pharmcare.exceptions.PharmacistException;

@Service
public class PharmacistServiceImpl implements PharmacistService {
	@Autowired
	private PharmacistRepo repo;
	@Autowired
	private Validate validate;
	private Logger logger = LoggerFactory.getLogger(PharmacistServiceImpl.class);

	@Override
	public Pharmacist addPharmacist(Pharmacist pharma) {
		logger.info("addPharmacist Service started");
		if (!(validate.validatePharmacist(pharma))) {
			logger.warn("invalid details");
			throw new PharmacistException("PLEASE CHECK YOUR GIVEN CREDENTIALS...");
		} else
			logger.info("addPharmacist Service ended");
		return repo.save(pharma);
	}

	@Override
	public Pharmacist updatePharmacist(Pharmacist pharma) {
		logger.info("updatePharmacist Service started");
		if (!(validate.validatePharmacist(pharma))) {
			logger.warn("invalid details");
			throw new PharmacistException("PLEASE CHECK YOUR GIVEN CREDENTIALS...");
		} else
			logger.info("UpdatePharmacist Service ended");
		return repo.save(pharma);
	}

	@Override
	public List<Pharmacist> viewPharmacist() {
		logger.info("viewPharmacist Service Started");
		logger.info("viewPharmacist Service ended");
		return repo.findAll();
	}

}
