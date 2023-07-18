package com.tm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tm.constant.CustomException;
import com.tm.dto.LoginDTO;
import com.tm.dto.UserDTO;
import com.tm.service.UserService;

@CrossOrigin()
@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public Object createUser(@RequestBody UserDTO user) throws Exception {
		try {
			return userService.craeteUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException("Error in createUser()", e);
		}
	}
	
	@PostMapping("/login")
	public Object login(@RequestBody LoginDTO loginDTO) throws Exception {
		try {
			return userService.loginUser(loginDTO);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException("Error in createUser()", e);
		}
	}
	
	@GetMapping("/getAllRole")
	public Object getAllRole() throws Exception {
		try {
			return userService.getAllRole();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException("Error in getAllRole()", e);
		}
	}

}
