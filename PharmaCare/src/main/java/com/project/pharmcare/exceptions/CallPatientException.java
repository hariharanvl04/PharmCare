package com.project.pharmcare.exceptions;

/**
 * @author VLH
 *
 */
public class CallPatientException extends RuntimeException {

	private static final long serialVersionUID = -4271456732351898052L;

	public CallPatientException(String msg) {
		super(msg);
	}

	public CallPatientException() {

	}
}