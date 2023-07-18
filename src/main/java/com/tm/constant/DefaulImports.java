package com.tm.constant;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;

public class DefaulImports implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CommonFunction commonFunction = new CommonFunction();

	@Column(name = "CreatedDate")
	private Timestamp createdDate = commonFunction.getcurrentTimestamp();

	@Column(name = "ModifiedDate")
	private Timestamp modifiedDate = commonFunction.getcurrentTimestamp();;

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

}
