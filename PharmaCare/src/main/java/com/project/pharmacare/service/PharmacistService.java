package com.project.pharmacare.service;

import java.util.List;

import com.project.pharmacare.entity.Pharmacist;

public interface PharmacistService {
	public Pharmacist addPharmacist(Pharmacist pharma);

	public Pharmacist updatePharmacist(Pharmacist pharma);

	public List<Pharmacist> viewPharmacist();

}
