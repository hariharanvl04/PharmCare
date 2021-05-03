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

import com.project.pharmacare.entity.Admin;
import com.project.pharmacare.entity.Doctor;
import com.project.pharmacare.entity.Pharmacist;
import com.project.pharmacare.service.AdminService;
import com.project.pharmacare.service.DoctorService;
import com.project.pharmacare.service.PharmacistService;

@RestController
@RequestMapping("/pharmacare")

public class AdminController {
	@Autowired
	private AdminService service;
	@Autowired
	private DoctorService docService;
	@Autowired
	private PharmacistService pharmService;

	@PostMapping("admin/addAdmin")
	public Admin addAdmin(@RequestBody Admin admin) {
		logger.info("addAdmin Controller started");
		logger.info("addAdmin Controller ended");
		return service.addAdmin(admin);
	}
	Logger logger = LoggerFactory.getLogger(AdminController.class);
	@PutMapping("admin/updateAdmin")
	public Admin updateAdmin(@RequestBody Admin admin) {
		logger.info("updateAdmin Controller started");
		
		logger.info("updateAdmin Controller ended");
		return service.updateAdmin(admin);
	}

	@DeleteMapping("admin/deleteAdmin/{id}")
	public void deleteAdmin(@PathVariable("id") int adminId) {
		logger.info("deleteAdmin Controller started");
		
		service.removeAdmin(adminId);
		logger.info("deleteAdmin Controller ended");
	}
	@GetMapping("admin/getAdminById/{id}")
	public Optional<Admin> getAdmingById(@PathVariable("id") int id) {

		logger.info("getAdminById Controller started");
		logger.info("getAdminById Controller ended");
				

		return service.viewAdmin(id);
	}
	@PostMapping("admin/addDoctor")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		logger.info("addDoctor Controller started");
		logger.info("addDoctor Controller ended");
		
		return  docService.addDoctor(doctor);

	}
	@PostMapping("admin/addPharmacist")
	public Pharmacist addPharmacist(@RequestBody Pharmacist pharma) {
		logger.info("addPharmacist Controller started");
		logger.info("addPharmacist Controller ended");
		return pharmService.addPharmacist(pharma);

	}
}
