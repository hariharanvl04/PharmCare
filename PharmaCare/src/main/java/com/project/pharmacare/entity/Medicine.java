package com.project.pharmacare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Medicine {
	@Id
	@GeneratedValue
	private int medicineId;
	private String medicineName;
	private float medicineGrams;
	private int days;
	private String purchasedDate;
	private int medicineCost;
	public String getPurchasedDate() {
		return purchasedDate;
	}
	public void setPurchasedDate(String purchasedDate) {
		this.purchasedDate = purchasedDate;
	}
	public int getMedicineCost() {
		return medicineCost;
	}
	public void setMedicineCost(int medicineCost) {
		this.medicineCost = medicineCost;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public float getMedicineGrams() {
		return medicineGrams;
	}
	public void setMedicineGrams(float medicineGrams) {
		this.medicineGrams = medicineGrams;
	}
	public Medicine(String medicineName, float medicineGrams) {
		super();
		this.medicineName = medicineName;
		this.medicineGrams = medicineGrams;
	}
	public Medicine(String medicineName, float medicineGrams, int days) {
		super();
		this.medicineName = medicineName;
		this.medicineGrams = medicineGrams;
		this.days = days;
	}
	
	public Medicine(String medicineName, float medicineGrams, int days, String purchasedDate, int medicineCost) {
		super();
		this.medicineName = medicineName;
		this.medicineGrams = medicineGrams;
		this.days = days;
		this.purchasedDate = purchasedDate;
		this.medicineCost = medicineCost;
	}
	
	public Medicine(int medicineId, String medicineName, float medicineGrams) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.medicineGrams = medicineGrams;
	}
	public Medicine() {
		super();
	}


}
