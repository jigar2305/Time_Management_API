package com.tm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tm.entity.Role;
import com.tm.repoDTO.SmallRoleDTO;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

	List<Role> findByRoleName(String roleName);
	
	 List<SmallRoleDTO> findAllByOrderByRoleNameAsc();
	

}
