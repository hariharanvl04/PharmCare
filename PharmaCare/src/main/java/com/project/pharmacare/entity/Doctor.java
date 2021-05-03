package com.project.pharmacare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor {
	@Id
	@GeneratedValue
	private int doctorId;
	private String doctorName;
	private long doctorPhone;
	private String doctorEmail;
	private String doctorLocality;
	private int doctorFee;
	
	

	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorid) {
		doctorId = doctorid;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorname) {
		doctorName = doctorname;
	}
	public long getDoctorPhone() {
		return doctorPhone;
	}
	public void setDoctorPhone(long doctorphone) {
		doctorPhone = doctorphone;
	}
	public String getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctoeEmail(String doctoremail) {
		
		doctorEmail = doctoremail;
	}
	public String getDoctorLocality() {
		return doctorLocality;
	}
	public void setDoctorLocality(String doctorlocality) {
		doctorLocality = doctorlocality;
	}
	public int getDoctorFee() {
		return doctorFee;
	}
	public void setDoctorFee(int doctorfee) {
		doctorFee = doctorfee;
	}

	
		
	
	public Doctor(int doctorId, String doctorName, long doctorPhone, String doctorEmail, String doctorLocality,
			int doctorFee) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorPhone = doctorPhone;
		this.doctorEmail = doctorEmail;
		this.doctorLocality = doctorLocality;
		this.doctorFee = doctorFee;
	}
	public Doctor() {
		super();
	}

}

