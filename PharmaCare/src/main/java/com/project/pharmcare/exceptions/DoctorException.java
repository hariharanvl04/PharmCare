package com.project.pharmcare.exceptions;

/**
 * @author VLH
 *
 */
public class DoctorException extends RuntimeException {

	private static final long serialVersionUID = -4271456732351898052L;

	public DoctorException(String msg) {
		super(msg);
	}

	public DoctorException() {

	}
}