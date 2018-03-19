package com.workout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.workout.entity.User;
import com.workout.entity.Workout;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserRepository.
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	 
	 /**
 	 * Find by email.
 	 *
 	 * @param email the email
 	 * @return the user
 	 */
 	User findByEmail(String email);

	 /**
 	 * Find user by id and password.
 	 *
 	 * @param userName the user name
 	 * @param password the password
 	 * @return the user
 	 */
 	@Query("from User u where u.userName=:userName and u.password=:password")
	 public User findUserByIdAndPassword(@Param("userName") String userName,@Param("password") String password);

}


