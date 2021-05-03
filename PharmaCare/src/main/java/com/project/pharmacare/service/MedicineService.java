package com.project.pharmacare.service;

import java.util.List;
import java.util.Optional;

import com.project.pharmacare.entity.Medicine;

public interface MedicineService {
	public Medicine addMedicine(Medicine medicine);

	public Medicine updateMedicine(Medicine medicine);

	public Optional<Medicine> viewMedicine(int medicineId);

	List<Medicine> getAllMedicine();

}
