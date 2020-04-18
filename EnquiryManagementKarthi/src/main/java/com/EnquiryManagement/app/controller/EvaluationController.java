package com.EnquiryManagement.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EnquiryManagement.app.model.Evaluation;
import com.EnquiryManagement.app.service.IEvaluationService;
import com.EnquiryManagement.app.service.SequenceGeneratorService;

@CrossOrigin
@RestController
@RequestMapping("evaluation")
public class EvaluationController {
	@Autowired
	private IEvaluationService evaluationService;
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;

	// method to insert
	@PostMapping("/add")
	public ResponseEntity<Evaluation> add(@RequestBody Evaluation evaluation) {
		// calling insert method
		//setting auto Increment
		evaluation.setEvaluationId(sequenceGeneratorService.generateSequence(Evaluation.SEQUENCE_NAME));
		return new ResponseEntity<Evaluation>(evaluationService.addUpdateEvaluation(evaluation), HttpStatus.OK);
	}

	// method to list all
	@GetMapping("/list")
	public ResponseEntity<List<Evaluation>> viewAllResources() {
		// calling list all method
		return new ResponseEntity<List<Evaluation>>(evaluationService.listAllEvaluation(), HttpStatus.OK);
	}
}
