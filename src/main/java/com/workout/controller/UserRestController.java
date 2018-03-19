package com.workout.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.workout.entity.User;
import com.workout.service.IUserService;
import com.workout.service.UserService;

// TODO: Auto-generated Javadoc
/**
 * The Class UserRestController.
 */
@RestController
public class UserRestController {
	
	/** The user service. */
	@Autowired
	private IUserService userService;

	/**
	 * Persist person.
	 *
	 * @param user the user
	 * @return the response entity
	 */
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public ResponseEntity<String> persistPerson(@RequestBody User user) {

		userService.createUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).build();

	}
	
	/**
	 * Login.
	 *
	 * @param user the user
	 * @return the response entity
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity login(@RequestBody User user) {

		User resposeUser = userService.findUserByIdAndPassword(user.getUserName(), user.getPassword());
		if(resposeUser != null) {
			return new ResponseEntity<>(resposeUser, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(" Invalid User Name / Password ...", HttpStatus.FORBIDDEN);
		}		

	}

}
