package com.EnquiryManagement.app.service;

import java.util.List;

import com.EnquiryManagement.app.model.Batch;

public interface IBatchService {
	// method for insert and update
	public Batch addBatch(Batch batch);

	// method for list all resources
	public List<Batch> listAllbatch();

}
