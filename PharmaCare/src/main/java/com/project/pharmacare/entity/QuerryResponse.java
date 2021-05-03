package com.project.pharmacare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class QuerryResponse {

	@Id
	@GeneratedValue
	private int pharmQuerryId;
	private String pharmQuerry;
	private String pharmresponse;

	public int getpharmQuerryId() {
		return pharmQuerryId;
	}

	public void setpharmQuerryId(int pharmQuerryId) {
		this.pharmQuerryId = pharmQuerryId;
	}

	public String getpharmQuerry() {
		return pharmQuerry;
	}

	public void setpharmQuerry(String pharmQuerry) {
		this.pharmQuerry = pharmQuerry;
	}

	public String getResponse() {
		return pharmresponse;
	}

	public void setResponse(String response) {
		this.pharmresponse = response;
	}

	public QuerryResponse(int querryId, String pharmQuerry, String response) {
		super();
		this.pharmQuerryId = querryId;
		this.pharmQuerry = pharmQuerry;
		this.pharmresponse = response;
	}

	public QuerryResponse(int querryId, String pharmQuerry) {
		super();
		this.pharmQuerryId = querryId;
		this.pharmQuerry = pharmQuerry;
	}

	
	

	public QuerryResponse() {
		super();
	}

}
