package com.project.pharmacare.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pharmacare.entity.Admin;
import com.project.pharmacare.repository.AdminRepo;
import com.project.pharmacare.validation.Validate;
import com.project.pharmcare.exceptions.AdminException;

@Service

public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepo repo;
	@Autowired
	private Validate validate;
	private Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

	@Override
	public Admin addAdmin(Admin admin) {
		logger.info("addAdmin Service started");
		if (!(validate.validateEmail(admin.getEmail())))
			throw new AdminException("invalid email...");
		logger.info("addAdmin Service ended");
		return repo.save(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		logger.info("updateAdmin Service started");

		if (!(validate.validateEmail(admin.getEmail())))
			throw new AdminException("invalid email...");
		logger.info("updateAdmin Service ended");
		return repo.save(admin);
	}

	@Override
	public Optional<Admin> viewAdmin(int adminId) {
		logger.info("viewAdmin Service Started");
		if (!(validate.validateById(adminId)))
			throw new AdminException("invalid id...");
		logger.info("viewAdmin Service started");
		return repo.findById(adminId);
	}

	@Override
	public void removeAdmin(int adminId) {
		logger.info("removeAdmin Service Started");
		if (!(validate.validateById(adminId)))
			throw new AdminException("invalid id...");
		logger.info("removeAdmin Service ended");
		repo.deleteById(adminId);
	}

}
