package com.workout.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workout.entity.User;
import com.workout.repository.UserRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class UserService.
 */
@Service
public class UserService implements IUserService{
	
	/** The user repository. */
	@Autowired
	private UserRepository userRepository;

	/* (non-Javadoc)
	 * @see com.workout.service.IUserService#createUser(com.workout.entity.User)
	 */
	public long createUser(User user) {
	return	userRepository.save(user).getUserId();
		
	}

	/* (non-Javadoc)
	 * @see com.workout.service.IUserService#findUserByEmail(java.lang.String)
	 */
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	
	/* (non-Javadoc)
	 * @see com.workout.service.IUserService#findUserByIdAndPassword(java.lang.String, java.lang.String)
	 */
	public User findUserByIdAndPassword(String userName,String password) {
		return userRepository.findUserByIdAndPassword(userName, password);
	}
}
