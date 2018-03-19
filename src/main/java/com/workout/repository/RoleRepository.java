package com.workout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workout.entity.Role;

// TODO: Auto-generated Javadoc
/**
 * The Interface RoleRepository.
 */
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	/**
	 * Find by role.
	 *
	 * @param role the role
	 * @return the role
	 */
	Role findByRole(String role);

}
