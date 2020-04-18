package com.EnquiryManagement.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.EnquiryManagement.app.model.Evaluation;

public interface IEvaluationRepo extends MongoRepository<Evaluation,Long> {

}
