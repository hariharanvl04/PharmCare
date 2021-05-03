package com.project.pharmacare.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pharmacare.entity.QuerryResponse;
import com.project.pharmacare.repository.QuerryResponseRepo;
import com.project.pharmacare.validation.Validate;
import com.project.pharmcare.exceptions.QuerryResponseException;

@Service
public class QuerryResponseServiceImpl implements QuerryResponseService {
	@Autowired
	private Validate validate;
	@Autowired
	private QuerryResponseRepo dao;

	private Logger logger = LoggerFactory.getLogger(QuerryResponseServiceImpl.class);
	

	@Override
	public List<QuerryResponse> viewQuerry() {
		logger.info("viewQuerry Service Started");
		logger.info("viewQuerry Service Started");
		return dao.findAll();
	}

	@Override
	public QuerryResponse addQuerry(QuerryResponse querry) {
		logger.info("addQuerry Service Started");
		if (!(validate.validateQuerry(querry))) {
			logger.warn("invalid details");
			throw new QuerryResponseException("PLEASE CHECK YOUR GIVEN CREDENTIALS...");
		} else
			logger.info("addQuerry Service ended");
		return dao.save(querry);
	}

	@Override
	public QuerryResponse updateQuerry(QuerryResponse querry) {
	
		logger.info("updateQuerry Service Started");
		if (!(validate.validateResponse(querry))) {
			logger.warn("invalid details");
			throw new QuerryResponseException("PLEASE CHECK YOUR GIVEN CREDENTIALS...");
		} else
			
		
			logger.info("updateQuerry Service ended");
		return dao.save(querry);

	}

	@Override
	public Optional<QuerryResponse> getQuerryById(int querryId) {

		return dao.findById(querryId);
	}

}
