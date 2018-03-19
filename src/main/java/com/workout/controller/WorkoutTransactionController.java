package com.workout.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.workout.entity.WorkoutTransaction;
import com.workout.service.IWorkoutTransactionService;

// TODO: Auto-generated Javadoc
/**
 * The Class WorkoutTransactionController.
 */
@RestController
public class WorkoutTransactionController {

	/** The workout transaction service. */
	@Autowired
	private IWorkoutTransactionService workoutTransactionService;

	/**
	 * Creates the workout transaction.
	 *
	 * @param workoutTransaction the workout transaction
	 * @return the response entity
	 */
	@RequestMapping(value = "/createWorkoutTransaction", method = RequestMethod.POST)
	public ResponseEntity<String> createWorkoutTransaction(@RequestBody WorkoutTransaction workoutTransaction) {
		workoutTransactionService.createWorkoutTransaction(workoutTransaction);
		return ResponseEntity.status(HttpStatus.CREATED).build();

	}
	
	/**
	 * Gets the all transactions.
	 *
	 * @return the all transactions
	 */
	@RequestMapping(value = "/getAllTransactions", method = RequestMethod.GET)
	public List getAllTransactions() {

		return workoutTransactionService.getAllTransactions();

	}
	
	/**
	 * Gets the workout transactions.
	 *
	 * @param workoutId the workout id
	 * @return the workout transactions
	 */
	@RequestMapping(value = "/getWorkoutTransactions/{workoutId}", method = RequestMethod.GET)
	public List getWorkoutTransactions(@PathVariable long workoutId) {
		return workoutTransactionService.getWorkoutTransactions(workoutId);
	}
 
}
