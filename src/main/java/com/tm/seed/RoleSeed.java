package com.tm.seed;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.tm.entity.Role;
import com.tm.entity.User;
import com.tm.repository.RoleRepository;
import com.tm.repository.UserRepository;

@Component
public class RoleSeed {

	@Autowired
	RoleRepository roleRepo;

	@Autowired
	UserRepository userRepo;

	@Autowired
	BCryptPasswordEncoder bcrypt;

	@PostConstruct
	void createroles() {
		List<Role> role = roleRepo.findByRoleName("admin");
		if (role.isEmpty()) {
			roleRepo.save(new Role("Teacher"));
			roleRepo.save(new Role("admin"));
		}
		User users = userRepo.findByEmail("admin@gmail.com");
		if (users  == null) {
			List<Role> roles = roleRepo.findByRoleName("admin");
			User user = new User();
			user.setRole(roles.get(0));
			user.setEmail("admin@gmail.com");
			String encpassword = bcrypt.encode("admin@123");
			user.setPassword(encpassword);
			user.setFirstName("admin");
			user.setLastName("super");
			userRepo.save(user);
		}
	}

}
