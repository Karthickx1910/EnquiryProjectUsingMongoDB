package com.EnquiryManagement.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Evaluation")
public class Evaluation {
	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";
	@Id
	private long evaluationId;
	private int registrationId;
	private Integer aptitudeScore;
	private Integer interviewScore;
	private Double percentage;
	private boolean statusQualified;

	public Evaluation() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Evaluation(int registrationId, Integer aptitudeScore, Integer interviewScore, Double percentage,
			boolean statusQualified) {
		super();
		this.registrationId = registrationId;
		this.aptitudeScore = aptitudeScore;
		this.interviewScore = interviewScore;
		this.percentage = percentage;
		this.statusQualified = statusQualified;
	}

	public long getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(long l) {
		this.evaluationId = l;
	}

	public Integer getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}

	public Integer getAptitudeScore() {
		return aptitudeScore;
	}

	public void setAptitudeScore(Integer aptitudeScore) {
		this.aptitudeScore = aptitudeScore;
	}

	public Integer getInterviewScore() {
		return interviewScore;
	}

	public void setInterviewScore(Integer interviewScore) {
		this.interviewScore = interviewScore;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public boolean isStatusQualified() {
		return statusQualified;
	}

	public void setStatusQualified(boolean statusQualified) {
		this.statusQualified = statusQualified;
	}

	@Override
	public String toString() {
		return "Evaluation [evaluationId=" + evaluationId + ", registrationId=" + registrationId + ", aptitudeScore="
				+ aptitudeScore + ", interviewScore=" + interviewScore + ", percentage=" + percentage
				+ ", statusQualified=" + statusQualified + "]";
	}



}
