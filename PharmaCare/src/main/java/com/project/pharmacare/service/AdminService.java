package com.project.pharmacare.service;

import java.util.Optional;

import com.project.pharmacare.entity.Admin;

public interface AdminService {
	public Admin addAdmin(Admin admin);

	public Admin updateAdmin(Admin admin);

	public Optional<Admin> viewAdmin(int adminId);

	public void removeAdmin(int adminId);

	
}
