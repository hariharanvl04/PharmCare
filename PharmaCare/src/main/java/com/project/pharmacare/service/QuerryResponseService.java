package com.project.pharmacare.service;

import java.util.List;
import java.util.Optional;

import com.project.pharmacare.entity.QuerryResponse;

public interface QuerryResponseService {

	QuerryResponse addQuerry(QuerryResponse querry);

	QuerryResponse updateQuerry(QuerryResponse querry);

	List<QuerryResponse> viewQuerry();
	Optional<QuerryResponse> getQuerryById(int querryId);
}
