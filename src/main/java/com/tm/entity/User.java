package com.tm.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "userTable")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6059310677650288938L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(name = "firstName",length = 50)
	private String firstName;

	@Column(name = "lastName",length = 50)
	private String lastName;
	
	@Column(name = "email",length = 100)
	private String email;
	
	@Column(name = "password",length = 250)
	private String password;

	@Column(name = "gender",length = 10)
	private String gender;
	
	@CreationTimestamp
	@Column(name = "CreatedDate", nullable = false, updatable = false)
	private Timestamp createdDate;

	@UpdateTimestamp
	@Column(name = "ModifiedDate")
	private Timestamp modifiedDate;
	
	@Column(name = "status")
	private Integer status = 1;
	
	@ManyToOne()
	@JoinColumn(name = "roleId",nullable = false)
	private Role role;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
