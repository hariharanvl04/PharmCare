package com.project.pharmcare.exceptions;

/**
 * @author VLH
 *
 */
public class MedicineException extends RuntimeException {

	private static final long serialVersionUID = -4271456732351898052L;

	public MedicineException(String msg) {
		super(msg);
	}

	public MedicineException() {

	}
}