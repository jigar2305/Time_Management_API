package com.tm.entity;

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


@Table(name = "classRoomTable")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ClassRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer classRoomId;

	@Column(name = "classRoomName",length = 100)
	private String classRoomName;
	
	@Column(name = "section",length = 30)
	private String section;

	@Column(name = "description",length = 250)
	private String description;
	
	@CreationTimestamp
	@Column(name = "CreatedDate", nullable = false, updatable = false)
	private Timestamp createdDate;

	@UpdateTimestamp
	@Column(name = "ModifiedDate")
	private Timestamp modifiedDate;

	public Integer getClassRoomId() {
		return classRoomId;
	}

	public void setClassRoomId(Integer classRoomId) {
		this.classRoomId = classRoomId;
	}

	public String getClassRoomName() {
		return classRoomName;
	}

	public void setClassRoomName(String classRoomName) {
		this.classRoomName = classRoomName;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
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
