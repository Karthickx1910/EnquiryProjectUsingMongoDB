package com.EnquiryManagement.app.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.EnquiryManagement.app.model.Batch;

public interface IBatchRepo extends MongoRepository<Batch,Long> {

	@Query("{'lastDate':{$gt:?0}}")
    public Batch findByDate(Date commencementDate);
	
}
