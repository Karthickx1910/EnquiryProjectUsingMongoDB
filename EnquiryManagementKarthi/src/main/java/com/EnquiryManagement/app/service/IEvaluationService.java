package com.EnquiryManagement.app.service;

import java.util.List;

import com.EnquiryManagement.app.model.Evaluation;

public interface IEvaluationService {

	// method for insert and update
	public Evaluation addUpdateEvaluation(Evaluation evaluation);

	// method for list all resources
	public List<Evaluation> listAllEvaluation();
	
	
}
