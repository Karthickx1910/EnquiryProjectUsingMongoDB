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
import com.EnquiryManagement.app.model.Shortlisted;
import com.EnquiryManagement.app.service.IShortListedService;
import com.EnquiryManagement.app.service.SequenceGeneratorService;

@CrossOrigin
@RestController
@RequestMapping("shortlisted")
public class ShortlistedController {

	@Autowired
	private IShortListedService ShortListedService;
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;

	// method to insert
	@PostMapping("/add")
	public ResponseEntity<Shortlisted> add(@RequestBody Shortlisted shortlisted) {
		// calling insert method
		// setting auto Increment
		shortlisted.setShortListedId(sequenceGeneratorService.generateSequence(Shortlisted.SEQUENCE_NAME));
		return new ResponseEntity<Shortlisted>(ShortListedService.addShortlisted(shortlisted), HttpStatus.OK);
	}

	// method to list all
	@GetMapping("/list")
	public ResponseEntity<List<Shortlisted>> viewAllResources() {
		// calling list all method
		return new ResponseEntity<List<Shortlisted>>(ShortListedService.listAllShortlist(), HttpStatus.OK);
	}
}
