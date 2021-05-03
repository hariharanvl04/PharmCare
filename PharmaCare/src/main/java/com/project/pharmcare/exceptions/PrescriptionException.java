package com.project.pharmcare.exceptions;

/**
 * @author VLH
 *
 */
public class PrescriptionException extends RuntimeException {

	private static final long serialVersionUID = -4271456732351898052L;

	public PrescriptionException(String msg) {
		super(msg);
	}

	public PrescriptionException() {

	}
}