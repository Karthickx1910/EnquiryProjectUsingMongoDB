package com.EnquiryManagement.app.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Document(collection ="Batch")
public class Batch {
	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";
	@Id
	private long batchId;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date commencementDate;

	private Integer courseId;
	private Integer resourceId;
	private Integer coordinatorId;

	public Batch() {
		// TODO Auto-generated constructor stub
	}

	public Batch(Date commencementDate, Integer courseId, Integer resourceId, Integer coordinatorId) {
		super();
		this.commencementDate = commencementDate;
		this.courseId = courseId;
		this.resourceId = resourceId;
		this.coordinatorId = coordinatorId;
	}

	public long getBatchId() {
		return batchId;
	}

	public void setBatchId(long batchId) {
		this.batchId = batchId;
	}

	public Date getCommencementDate() {
		return commencementDate;
	}

	public void setCommencementDate(Date commencementDate) {
		this.commencementDate = commencementDate;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getResourceId() {
		return resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public Integer getCoordinatorId() {
		return coordinatorId;
	}

	public void setCoordinatorId(Integer coordinatorId) {
		this.coordinatorId = coordinatorId;
	}

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", commencementDate=" + commencementDate + ", courseId=" + courseId
				+ ", resourceId=" + resourceId + ", coordinatorId=" + coordinatorId + "]";
	}

}
