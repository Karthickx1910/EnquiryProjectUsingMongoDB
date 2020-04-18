package com.EnquiryManagement.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.EnquiryManagement.app.model.Shortlisted;

public interface IShortlistedRepo extends MongoRepository<Shortlisted,Long>{

}
