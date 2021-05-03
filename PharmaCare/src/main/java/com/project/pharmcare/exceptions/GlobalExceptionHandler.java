package com.project.pharmcare.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(GlobalException.class)
	public final ResponseEntity<ExceptionResponse> handleGlobalException(GlobalException ex, WebRequest req) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),

				req.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);

	}

	@ExceptionHandler(AdminException.class)
	public final ResponseEntity<ExceptionResponse> handleAdminException(AdminException ex, WebRequest req) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),

				req.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);

	}

	@ExceptionHandler(CallPatientException.class)
	public final ResponseEntity<ExceptionResponse> handleCallPatientException(CallPatientException ex, WebRequest req) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),

				req.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);

	}

	@ExceptionHandler(MedicineException.class)
	public final ResponseEntity<ExceptionResponse> handleMedicineException(MedicineException ex, WebRequest req) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),

				req.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);

	}

	@ExceptionHandler(PatientException.class)
	public final ResponseEntity<ExceptionResponse> handlePatientException(PatientException ex, WebRequest req) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),

				req.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);

	}

	@ExceptionHandler(PharmacistException.class)
	public final ResponseEntity<ExceptionResponse> handlePharmacistException(PharmacistException ex, WebRequest req) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),

				req.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);

	}

	@ExceptionHandler(PrescriptionException.class)
	public final ResponseEntity<ExceptionResponse> handlePrescriptionException(PrescriptionException ex,
			WebRequest req) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),

				req.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);

	}

	@ExceptionHandler(QuerryResponseException.class)
	public final ResponseEntity<ExceptionResponse> handleQuerryResponseException(QuerryResponseException ex,
			WebRequest req) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),

				req.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);

	}
}