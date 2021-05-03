package com.project.pharmacare.service;

import java.util.List;
import java.util.Optional;

import com.project.pharmacare.entity.CallPatient;

public interface CallPatientService {
	CallPatient addCall(CallPatient callreport);

	CallPatient updateCall(CallPatient callreport);

	void deleteCall(int callId);

	Optional<CallPatient> getCallById(int id);

	List<CallPatient> getAllCall();

}
