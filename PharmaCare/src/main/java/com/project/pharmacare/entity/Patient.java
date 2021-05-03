package com.project.pharmacare.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
	
public class Patient {
	@Id
	@GeneratedValue
	private  int patientId;
	private String patientName;
	private long patientPhoneNo;
	private String patientEmail;
	public  int getPatientId() {
		return patientId;
	}
	public  void setPatientId(int patientid) {
		patientId = patientid;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientname) {
		patientName = patientname;
	}
	public long getPatientPhoneNo() {
		return patientPhoneNo;
	}
	public void setPatientPhoneNo(long patientphoneNo) {
		patientPhoneNo = patientphoneNo;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientemail) {
		patientEmail = patientemail;
	}

	public Patient(int patientId, String patientName, long patientPhoneNo, String patientEmail) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientPhoneNo = patientPhoneNo;
		this.patientEmail = patientEmail;
	}
	@Override
	public String toString() {
		return "Patient [PatientName=" + patientName + ", PatientPhoneNo=" + patientPhoneNo + ", PatientEmail="
				+ patientEmail + "]";
	}
	public Patient() {
		super();

	}
	

}
