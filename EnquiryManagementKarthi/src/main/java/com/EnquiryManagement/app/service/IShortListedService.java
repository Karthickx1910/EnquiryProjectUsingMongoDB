package com.EnquiryManagement.app.service;

import java.util.List;

import com.EnquiryManagement.app.model.Shortlisted;

public interface IShortListedService {

	// method for insert and update
	public Shortlisted addShortlisted(Shortlisted shortlisted);

	// method for list all resources
	public List<Shortlisted> listAllShortlist();

	

}
