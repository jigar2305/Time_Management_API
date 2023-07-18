package com.tm.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tm.constant.Constant;
import com.tm.constant.CustomException;
import com.tm.constant.Status;
import com.tm.dto.LoginDTO;
import com.tm.dto.UserDTO;
import com.tm.entity.Role;
import com.tm.entity.User;
import com.tm.repoDTO.SmallRoleDTO;
import com.tm.repository.RoleRepository;
import com.tm.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService,Constant{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	BCryptPasswordEncoder bcrypt;

	@Override
	public Object craeteUser(UserDTO userDTO) throws Exception {
		try {
			User users = userRepository.findByEmail(userDTO.getEmail());
			if(null != users) {
				return new Status(userDTO.getEmail(),"Email Already exist", CONFLICT);
			}
			User user = new User();
			BeanUtils.copyProperties(userDTO, user);
			String encpassword = bcrypt.encode(user.getPassword());
			user.setPassword(encpassword);
			userRepository.save(user);
			return new Status("user created susscessfully", OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException("Error in craeteUser()", e);
		}
	}

	@Override
	public Object loginUser(LoginDTO loginDTO) {
		String email = loginDTO.getEmail();
		User user = userRepository.findByEmail(email);
		if (user == null) {
			return new Status(loginDTO, "Not valid Email", NOT_FOUND);
		} else if (!bcrypt.matches(loginDTO.getPassword(), user.getPassword())) {
			return new Status(loginDTO, "Invalid Credentials", UNAUTHORIZED);
		} else {
//			user.setAuthToken(tokenService.createtoken(20));
//			userRepository.save(user);
			return new Status(user, "Login done", OK);
		}
	}

	@Override
	public List<SmallRoleDTO> getAllRole(){
		return roleRepository.findAllByOrderByRoleNameAsc();
		
	}
}
