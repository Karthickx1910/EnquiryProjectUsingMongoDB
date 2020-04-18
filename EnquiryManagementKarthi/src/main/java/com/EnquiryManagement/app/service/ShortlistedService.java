package com.EnquiryManagement.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EnquiryManagement.app.model.Shortlisted;

import com.EnquiryManagement.app.repository.IShortlistedRepo;

@Service
public class ShortlistedService implements IShortListedService {
	// creating object for Repo
	@Autowired
	private IShortlistedRepo shortListedRepo;

	@Override
	public Shortlisted addShortlisted(Shortlisted shortlisted) {
		return shortListedRepo.save(shortlisted);
	}

	@Override
	public List<Shortlisted> listAllShortlist() {
		return shortListedRepo.findAll();
	}

}
