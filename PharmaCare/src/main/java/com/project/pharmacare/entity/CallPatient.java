package com.project.pharmacare.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class CallPatient{
	
	@Id
	@GeneratedValue
	private int callId ;	
	private int prescriptionId ;
	private String patientName; 
	private String pharmacistName; 
	private long patientNumber;
	private long pharmacistNumber;
	private String callStatus;
	private String updatedCall;
	@OneToMany(cascade = {CascadeType.ALL})
	private List<QuerryResponse> queRes;
	
	
	
	public List<QuerryResponse> getQueRes() {
		return queRes;
	}
	public void setQueRes(List<QuerryResponse> queRes) {
		this.queRes = queRes;
	}
	
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPharmacistName() {
		return pharmacistName;
	}
	public void setPharmacistName(String pharmacistName) {
		this.pharmacistName = pharmacistName;
	}
	public long getPatientNumber() {
		return patientNumber;
	}
	public void setPatientNumber(long patientNumber) {
		this.patientNumber = patientNumber;
	}
	public long getPharmacistNumber() {
		return pharmacistNumber;
	}
	public void setPharmacistNumber(long pharmacistNumber) {
		this.pharmacistNumber = pharmacistNumber;
	}
	public String getCallStatus() {
		return callStatus;
	}
	public void setCallStatus(String callStatus) {
		this.callStatus = callStatus;
	}
	public String getUpdatedCall() {
		return updatedCall;
	}
	public void setUpdatedCall(String updatedCall) {
		this.updatedCall = updatedCall;
	}
	
	
	public int getCallId() {
		return callId;
	}
	public void setCallid(int callid) {
		this.callId = callid;
	}
	public int getPrescriptionid() {
		return prescriptionId;
	}
	public void setPrescriptionid(int prescriptionid) {
		this.prescriptionId = prescriptionid;
	}
	public CallPatient(int callId, String patientName, String pharmacistName, long patientNumber, long pharmacistNumber,
			String callStatus, String updatedCall) {
		super();
		this.callId = callId;
		this.patientName = patientName;
		this.pharmacistName = pharmacistName;
		this.patientNumber = patientNumber;
		this.pharmacistNumber = pharmacistNumber;
		this.callStatus = callStatus;
		this.updatedCall = updatedCall;
		
	}
	public CallPatient(int callId, String patientName, long patientNumber, String callStatus, String updatedCall) {
		super();
		this.callId = callId;
		this.patientName = patientName;
		this.patientNumber = patientNumber;
		this.callStatus = callStatus;
		this.updatedCall = updatedCall;
	}
	

	public CallPatient(String patientName, String pharmacistName, long patientNumber, long pharmacistNumber,
			String callStatus, String updatedCall, List<QuerryResponse> queRes) {
		super();
		this.patientName = patientName;
		this.pharmacistName = pharmacistName;
		this.patientNumber = patientNumber;
		this.pharmacistNumber = pharmacistNumber;
		this.callStatus = callStatus;
		this.updatedCall = updatedCall;
		this.queRes = queRes;
	}
	
	public CallPatient(int callid, int prescriptionid, String patientName, String pharmacistName, long patientNumber,
			long pharmacistNumber, String callStatus, String updatedCall, List<QuerryResponse> queRes) {
		super();
		this.callId = callid;
		this.prescriptionId = prescriptionid;
		this.patientName = patientName;
		this.pharmacistName = pharmacistName;
		this.patientNumber = patientNumber;
		this.pharmacistNumber = pharmacistNumber;
		this.callStatus = callStatus;
		this.updatedCall = updatedCall;
		this.queRes = queRes;
	}
	public CallPatient() {
		super();
	}
	
		
	
}
