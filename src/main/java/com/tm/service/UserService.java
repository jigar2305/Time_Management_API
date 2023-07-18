package com.tm.service;

import java.util.List;

import com.tm.dto.LoginDTO;
import com.tm.dto.UserDTO;
import com.tm.repoDTO.SmallRoleDTO;

public interface UserService {
	
	public Object craeteUser(UserDTO user) throws Exception;

	public Object loginUser(LoginDTO loginDTO);

	List<SmallRoleDTO> getAllRole();

}
