package com.project.pharmcare.exceptions;

/**
 * @author VLH
 *
 */
public class QuerryResponseException extends RuntimeException {

	private static final long serialVersionUID = -4271456732351898052L;

	public QuerryResponseException(String msg) {
		super(msg);
	}

	public QuerryResponseException() {

	}
}