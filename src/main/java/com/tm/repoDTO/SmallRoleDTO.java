package com.tm.repoDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface SmallRoleDTO {
	
	@JsonProperty("label")
	String getRoleName();
	
	@JsonProperty("value")
	Integer getRoleId();

}
