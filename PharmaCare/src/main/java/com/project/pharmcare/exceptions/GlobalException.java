package com.project.pharmcare.exceptions;

/**
 * @author VLH
 *
 */
public class GlobalException extends RuntimeException {

	private static final long serialVersionUID = -4271456732351898052L;

	public GlobalException(String msg) {
		super(msg);
	}

	public GlobalException() {

	}
}