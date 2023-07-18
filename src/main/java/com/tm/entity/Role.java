package com.tm.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "roleTable")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","users"})
public class Role implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4576622527498966163L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roleId;

	@Column(name = "roleName",length = 100)
	private String roleName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "role")
	public List<User> users = new ArrayList<>();
	
	@CreationTimestamp
	@Column(name = "CreatedDate", nullable = false, updatable = false)
	private Timestamp createdDate;

	@UpdateTimestamp
	@Column(name = "ModifiedDate")
	private Timestamp modifiedDate;
	
	
	public Role() {
	}

	public Role(String roleName) {
		this.roleName = roleName;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
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
