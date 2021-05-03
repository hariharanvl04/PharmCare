package com.project.pharmcare.exceptions;

/**
 * @author VLH
 *
 */
public class PatientException extends RuntimeException {

	private static final long serialVersionUID = -4271456732351898052L;

	public PatientException(String msg) {
		super(msg);
	}

	public PatientException() {

	}
}