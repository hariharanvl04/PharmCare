package com.project.pharmacare.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Prescription {
   @Id
   @GeneratedValue
    private int prescriptionId;
   
   private int patientId;
    private String patientName;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Medicine> medicine;
    private String date;

    public Prescription(int prescriptionid, int patientId, String patientName, List<Medicine> medicine, String date) {
		super();
		prescriptionId = prescriptionid;
		this.patientId = patientId;
		this.patientName = patientName;
		this.medicine = medicine;
		this.date = date;
	}

	public Prescription() {
        
    }

	public int getPrescriptionid() {
		return prescriptionId;
	}

	public void setPrescriptionid(int prescriptionid) {
		prescriptionId = prescriptionid;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public List<Medicine> getMedicine() {
		return medicine;
	}

	public void setMedicine(List<Medicine> medicine) {
		this.medicine = medicine;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


    
    
    
   
    
    
}