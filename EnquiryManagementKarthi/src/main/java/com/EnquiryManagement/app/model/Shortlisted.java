package com.EnquiryManagement.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Document(collection = "Shortlisted")
public class Shortlisted {

	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";
	@Id
	private long shortListedId;
	private Integer registrationId;
	private Integer courseId;
	private Integer batchId;

	public Shortlisted() {
		// TODO Auto-generated constructor stub
	}

	public Shortlisted(Integer registrationId, Integer courseId, Integer batchId) {
		super();
		this.registrationId = registrationId;
		this.courseId = courseId;
		this.batchId = batchId;
	}

	public long getShortListedId() {
		return shortListedId;
	}

	public void setShortListedId(long shortListedId) {
		this.shortListedId = shortListedId;
	}

	public Integer getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

	@Override
	public String toString() {
		return "Shortlisted [shortListedId=" + shortListedId + ", registrationId=" + registrationId + ", courseId="
				+ courseId + ", batchId=" + batchId + "]";
	}

}
