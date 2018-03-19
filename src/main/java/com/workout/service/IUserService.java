package com.workout.service;

import com.workout.entity.User;

// TODO: Auto-generated Javadoc
/**
 * The Interface IUserService.
 */
public interface IUserService {
	
	/**
	 * Creates the user.
	 *
	 * @param user the user
	 * @return the long
	 */
	public long createUser(User user);
	
	/**
	 * Find user by email.
	 *
	 * @param email the email
	 * @return the user
	 */
	public User findUserByEmail(String email);
	
	/**
	 * Find user by id and password.
	 *
	 * @param userName the user name
	 * @param password the password
	 * @return the user
	 */
	public User findUserByIdAndPassword(String userName,String password);
}
