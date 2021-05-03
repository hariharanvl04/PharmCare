package com.project.pharmacare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pharmacist {
	@Id
	@GeneratedValue
	private int pharmacistId;
	private String pharmacistName;
	private long pharmaphoneNo;
	private String pharmaEmail;
	private String pharmaLocality;
	private int costPerMg;



	public int getPharmacistId() {
		return pharmacistId;
	}

	public Pharmacist() {
		super();
	}

	public void setPharmacistId(int pharmacistid) {
		pharmacistId = pharmacistid;
	}

	public String getPharmacistName() {
		return pharmacistName;
	}

	public void setPharmacistName(String pharmacistname) {
		pharmacistName = pharmacistname;
	}

	public long getPhoneNo() {
		return pharmaphoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		pharmaphoneNo = phoneNo;
	}

	public String getEmail() {
		return pharmaEmail;
	}

	public void setEmail(String email) {
		this.pharmaEmail = email;
	}

	public String getPharmaLocality() {
		return pharmaLocality;
	}

	public void setPharmaLocality(String pharmalocality) {
		pharmaLocality = pharmalocality;
	}

	public int getCostPerMg() {
		return costPerMg;
	}

	public void setCostPerMg(int costperMg) {
		costPerMg = costperMg;
	}

	public Pharmacist(int pharmacistId, String pharmacistName, long pharmaphoneNo, String pharmaEmail,
			String pharmaLocality, int costPerMg) {
		super();
		this.pharmacistId = pharmacistId;
		this.pharmacistName = pharmacistName;
		this.pharmaphoneNo = pharmaphoneNo;
		this.pharmaEmail = pharmaEmail;
		this.pharmaLocality = pharmaLocality;
		this.costPerMg = costPerMg;
	}


	

}
