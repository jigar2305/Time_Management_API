package com.tm.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Table(name = "subjectTable")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Subject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1873051386143412600L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subjectId; 
	
	@Column(name = "subjectName",length = 100)
	private String subjectName;
	
	@Column(name = "subjectCode",length = 80)
	private String subjectCode; 
	
	@Column(name = "department",length = 100)
	private String department; 
	
	@Column(name = "description",columnDefinition = "TEXT")
	private String description; 
	
	@CreationTimestamp
	@Column(name = "CreatedDate", nullable = false, updatable = false)
	private Timestamp createdDate;

	@UpdateTimestamp
	@Column(name = "ModifiedDate")
	private Timestamp modifiedDate;

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
