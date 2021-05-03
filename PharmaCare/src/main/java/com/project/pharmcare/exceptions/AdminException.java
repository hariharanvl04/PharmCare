package com.project.pharmcare.exceptions;

/**
 * @author VLH
 *
 */
public class AdminException extends RuntimeException {

	private static final long serialVersionUID = -4271456732351898052L;

	public AdminException(String msg) {
		super(msg);
	}

	public AdminException() {

	}
}