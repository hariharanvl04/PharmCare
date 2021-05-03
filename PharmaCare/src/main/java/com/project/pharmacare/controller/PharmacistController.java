package com.project.pharmacare.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacare.entity.CallPatient;
import com.project.pharmacare.entity.Pharmacist;
import com.project.pharmacare.entity.Prescription;
import com.project.pharmacare.entity.QuerryResponse;
import com.project.pharmacare.service.CallPatientService;
import com.project.pharmacare.service.PharmacistService;
import com.project.pharmacare.service.PrescriptionService;
import com.project.pharmacare.service.QuerryResponseService;

@RestController
@RequestMapping("/pharmacare")

public class PharmacistController {
	@Autowired
	private PharmacistService service;

	@Autowired
	private QuerryResponseService querry;

	@Autowired
	CallPatientService call;
	@Autowired
	PrescriptionService med;
	
	Logger logger = LoggerFactory.getLogger(PharmacistController.class);
	@PostMapping("/Pharmacist/addPharm")
	public Pharmacist addPharmacist(@RequestBody Pharmacist pharma) {
		logger.info("addPharmacist Controller started");
		logger.info("addPharmacist Controller ended");
		return service.addPharmacist(pharma);

	}

	@PutMapping("/Pharmacist/updatePharm")
	public Pharmacist updatePharmacist(@RequestBody Pharmacist pharma) {
		logger.info("updatePharmacist Controller started");
		logger.info("updatePharmacist Controller ended");
		return service.updatePharmacist(pharma);
	}

	@GetMapping("/Pharmacist/viewPharm")
	public List<Pharmacist> viewPharmacist() {
		logger.info("viewPharmacist Controller started");
		logger.info("viewPharmacist Controller ended");
		return service.viewPharmacist();

	}

	@PostMapping("/Pharmacist/addQuerry")
	public QuerryResponse addQuerry(@RequestBody QuerryResponse pharma) {
		logger.info("addQuerry Controller started");
		logger.info("addQuerry Controller ended");
	

		return  querry.addQuerry(pharma);

	}

	@PutMapping("/Pharmacist/updateQuerry")
	public QuerryResponse updateQuerry(@RequestBody QuerryResponse querryResponse) {
		logger.info("updateQuerry Controller started");
		logger.info("updateQuerry Controller ended");
		 

		return  querry.updateQuerry(querryResponse);
	}

	@GetMapping("/Pharmacist/viewQuerry")
	public List<QuerryResponse> getAllQuerry() {
		logger.info("viewQuerry Controller started");
		
		
		logger.info("viewQuerry Controller ended");
		return  querry.viewQuerry();
	}

	@PostMapping("/Pharmacist/addCall")
	public CallPatient addQuerry(@RequestBody CallPatient callpatient) {
		logger.info("addCall Controller started");
		
		logger.info("addCall Controller ended");
		return  call.addCall(callpatient);

	}

	@PutMapping("/Pharmacist/updateCall")
	public CallPatient updateCall(@RequestBody CallPatient callpatient) {
		logger.info("updateCall Controller started");
		
		logger.info("updateCall Controller ended");
		return  call.updateCall(callpatient);

	}

	@GetMapping("/Pharmacist/getCallById/{callId}")
	public Optional<CallPatient> geCallPatientById(@PathVariable("callId") int cid) {
		logger.info("getCallById Controller started");
		
		logger.info("getCallById Controller ended");
		return call.getCallById(cid);
	}

	@DeleteMapping("/Pharmacist/deleteCallPatient/{cpid}")
	public HttpStatus deleteParent(@PathVariable("cpid") int callpatientId) {
		logger.info("deleteCallPatient Controller started");
		
		call.deleteCall(callpatientId);
		logger.info("deleteCallPatient Controller started");
		return HttpStatus.GONE;
		
	}

	@GetMapping("/Pharmacist/getAllCalls")
	public List<CallPatient> getAllcalls() {
		logger.info("getAllCallPatient Controller started");
		List<CallPatient> test = call.getAllCall();
		logger.info("getAllCallPatient Controller ended");
		return test;
	}

	@PutMapping("/Pharmacist/issueMedicine")
	public Prescription addQuerry(@RequestBody Prescription medicine) {
		logger.info("issueMedicine Controller started");
		Prescription test = med.addPrescription(medicine);
		logger.info("issueMedicine Controller ended");
		return test;

	}
	
	

}
