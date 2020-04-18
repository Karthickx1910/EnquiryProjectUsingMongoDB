package com.EnquiryManagement.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EnquiryManagement.app.model.Evaluation;
import com.EnquiryManagement.app.repository.IEvaluationRepo;

@Service
public class EvaluationService implements IEvaluationService {

	// creating object for Repo
	@Autowired
	private IEvaluationRepo evaluationRepo;

	@Override
	public Evaluation addUpdateEvaluation(Evaluation evaluation) {
		// TODO Auto-generated method stub
		return evaluationRepo.save(evaluation);
	}

	@Override
	public List<Evaluation> listAllEvaluation() {
		// TODO Auto-generated method stub
		return evaluationRepo.findAll();
	}

}
