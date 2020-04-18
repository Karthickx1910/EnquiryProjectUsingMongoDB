package com.EnquiryManagement.app.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EnquiryManagement.app.model.Batch;

import com.EnquiryManagement.app.repository.IBatchRepo;
import com.EnquiryManagement.app.service.IBatchService;

import com.EnquiryManagement.app.service.SequenceGeneratorService;

@CrossOrigin
@RestController
@RequestMapping("batch")
public class BatchController {
	@Autowired
	private IBatchService batchService;
	@Autowired
	private IBatchRepo batchRepo;
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;

	// method to insert
	@PostMapping("/add")
	public ResponseEntity<Batch> add(@RequestBody Batch batch) {
		// calling insert method
		// setting auto Increment
		batch.setBatchId(sequenceGeneratorService.generateSequence(Batch.SEQUENCE_NAME));
		return new ResponseEntity<Batch>(batchService.addBatch(batch), HttpStatus.OK);
	}

	// method to list all
	@GetMapping("/list")
	public ResponseEntity<List<Batch>> viewAllResources() {
		// calling list all method
		return new ResponseEntity<List<Batch>>(batchService.listAllbatch(), HttpStatus.OK);
	}

	@GetMapping("/searchDate/{yyyy-MM-dd}")
	public ResponseEntity<Batch> getDate(@PathVariable("yyyy-MM-dd") Date commencementDate) {
		Batch batch = batchRepo.findByDate(commencementDate);
		return ResponseEntity.ok().body(batch);
	}

}