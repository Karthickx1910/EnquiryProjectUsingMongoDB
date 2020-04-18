package com.EnquiryManagement.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EnquiryManagement.app.model.Batch;
import com.EnquiryManagement.app.model.Evaluation;
import com.EnquiryManagement.app.repository.IBatchRepo;
import com.EnquiryManagement.app.repository.IEvaluationRepo;

import lombok.Setter;

@Service
public class BatchService implements IBatchService {
	// creating object for ResourceRepo
	@Autowired
	private IBatchRepo batchRepo;

	@Override
	public Batch addBatch(Batch batch) {
		return batchRepo.save(batch);
	}

	@Override
	public List<Batch> listAllbatch() {
		return batchRepo.findAll();
	}
	
}
