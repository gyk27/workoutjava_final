package com.workout.service;

import java.util.List;

import com.workout.entity.WorkoutTransaction;

// TODO: Auto-generated Javadoc
/**
 * The Interface IWorkoutTransactionService.
 */
public interface IWorkoutTransactionService {
	
	/**
	 * Creates the workout transaction.
	 *
	 * @param workoutTransaction the workout transaction
	 * @return the long
	 */
	public long createWorkoutTransaction(WorkoutTransaction workoutTransaction);
	
	/**
	 * Gets the all transactions.
	 *
	 * @return the all transactions
	 */
	public List<WorkoutTransaction> getAllTransactions();
	
	/**
	 * Gets the workout transactions.
	 *
	 * @param workoutId the workout id
	 * @return the workout transactions
	 */
	public List<WorkoutTransaction> getWorkoutTransactions(long workoutId);
}
