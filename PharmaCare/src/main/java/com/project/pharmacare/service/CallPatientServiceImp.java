package com.project.pharmacare.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pharmacare.entity.CallPatient;
import com.project.pharmacare.repository.CallPatientRepo;
import com.project.pharmacare.validation.Validate;
import com.project.pharmcare.exceptions.CallPatientException;

@Service
public class CallPatientServiceImp implements CallPatientService {
	
	@Autowired
	private CallPatientRepo dao;
	@Autowired
	private Validate validate;
	private Logger logger = LoggerFactory.getLogger(CallPatientServiceImp.class);

	@Override
	public CallPatient addCall(CallPatient callpatient) {
		logger.info("addCallPatient Service started");
		if (!(validate.validatecallPatient(callpatient))) {
			logger.warn("invalid details");
			throw new CallPatientException("PLEASE CHECK YOUR GIVEN CREDENTIALS...");
		} else
			logger.info("addCallPatient Service ended");
		return dao.save(callpatient);

	}

	@Override
	public CallPatient updateCall(CallPatient callpatient) {
		logger.info("updateCallPatient Service started");
		if (!(validate.validatecallPatient(callpatient)))
			throw new CallPatientException("PLEASE CHECK YOUR GIVEN CREDENTIALS...");
		else
			logger.info("updateCallPatient Service ended");
		return dao.save(callpatient);
	}

	@Override
	public void deleteCall(int callId) {
		logger.info("deleteCallPatient Service started");
		if (!(validate.validatePatientById(callId)))
			throw new CallPatientException("PLEASE CHECK YOUR GIVEN CALLID...");
		else
			logger.info("deleteCallPatient Service ended");
		dao.deleteById(callId);

	}

	@Override
	public Optional<CallPatient> getCallById(int id) {
		logger.info("getCallPatientById Service started");
		/*if (!(validate.validatePatientById(id)))
			throw new CallPatientException("PLEASE CHECK YOUR GIVEN CALLID...");
		else
			logger.info("getCallPatientById Service ended");*/
		return dao.findBycallId(id);
	}

	@Override
	public List<CallPatient> getAllCall() {
		logger.info("getAllCallPatient Service started");

		logger.info("getAllCallPatient Service ended");
		return dao.findAll();

	}

	
}
