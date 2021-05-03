package com.project.pharmacare.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pharmacare.entity.Medicine;
import com.project.pharmacare.repository.MedicineRepo;
import com.project.pharmacare.validation.Validate;
import com.project.pharmcare.exceptions.MedicineException;

@Service

public class MedicineServiceImpl implements MedicineService {
	@Autowired
	private MedicineRepo dao;
	@Autowired
	private Validate validate;
	private Logger logger = LoggerFactory.getLogger(MedicineServiceImpl.class);

	@Override
	public Medicine addMedicine(Medicine medicine) {
		logger.info("addMedicine Service started");
		if (!(validate.validateMedicine(medicine)))
			throw new MedicineException("PLEASE ENTER ONLY ALPHABETS FOR medicine'S NAME...");
		else
			logger.info("addMedicine Service ended");
		return dao.save(medicine);

	}

	@Override
	public Medicine updateMedicine(Medicine medicine) {
		logger.info("updateMedicine Service Started");
		if (!(validate.validateMedicine(medicine)))
			throw new MedicineException("PLEASE ENTER ONLY ALPHABETS FOR medicine'S NAME...");
		else
			logger.info("updateMedicine Service ended");
		return dao.save(medicine);

	}

	@Override
	public Optional<Medicine> viewMedicine(int medicineId) {
		logger.info("viewMedicine Service Started");
		if (!(validate.validateMedicineById(medicineId)))
			throw new MedicineException("PLEASE ENTER A VALID medicine ID...");
		else
			logger.info("viewMedicine Service ended");
		return dao.findById(medicineId);
	}

	public List<Medicine> getAllMedicine() {

		return dao.findAll();
	}

}
