package com.workout.service;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.workout.entity.Workout;
import com.workout.entity.WorkoutTransaction;
import com.workout.repository.WorkoutRepository;
import com.workout.repository.WorkoutTransactionRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class WorkoutTransactionService.
 */
@Service
public class WorkoutTransactionService implements IWorkoutTransactionService{
	
	/** The workout transaction repository. */
	@Autowired
	private WorkoutTransactionRepository workoutTransactionRepository;
	
	/** The workout repository. */
	@Autowired
	private WorkoutRepository workoutRepository;

	/* (non-Javadoc)
	 * @see com.workout.service.IWorkoutTransactionService#createWorkoutTransaction(com.workout.entity.WorkoutTransaction)
	 */
	public long createWorkoutTransaction(WorkoutTransaction workoutTransaction) {
		Workout workout = workoutRepository.getWorkout(workoutTransaction.getWorkoutId());
		long duration = Duration.between(workoutTransaction.getStartTime(), workoutTransaction.getStopTime())
				.toMillis();
		workoutTransaction
				.setDuration(Duration.between(workoutTransaction.getStartTime(), workoutTransaction.getStopTime()));
		workoutTransaction.setCalsBurnt(calculateCalsBurnt(duration, workout));

		return workoutTransactionRepository.save(workoutTransaction).getWorkoutId();
	}
	
	/* (non-Javadoc)
	 * @see com.workout.service.IWorkoutTransactionService#getAllTransactions()
	 */
	@Cacheable(value="WorkoutTransaction")
	public List<WorkoutTransaction> getAllTransactions(){
		List<WorkoutTransaction> allTransactions = workoutTransactionRepository.findAll();
		return allTransactions;
	}
	
	/* (non-Javadoc)
	 * @see com.workout.service.IWorkoutTransactionService#getWorkoutTransactions(long)
	 */
	public List<WorkoutTransaction> getWorkoutTransactions(long workoutId) {
		List<WorkoutTransaction> transactionsForWorkoutId = workoutTransactionRepository.getWorkoutTransactions(workoutId);
		return transactionsForWorkoutId;

	}

	/**
	 * Calculate cals burnt.
	 *
	 * @param duration the duration
	 * @param workout the workout
	 * @return the double
	 */
	private double calculateCalsBurnt(long duration, Workout workout) {

		double calsBurnt = 0;
		if (workout.getUnitTime().name().equals("HOUR")) {
			calsBurnt = (workout.getCalBurntPerUnitTime() / TimeUnit.HOURS.toMillis(1));
		} else if (workout.getUnitTime().name().equals("MINUTE")) {
			calsBurnt = (workout.getCalBurntPerUnitTime() / TimeUnit.MINUTES.toMillis(1));
		} else if (workout.getUnitTime().name().equals("SECOND")) {
			calsBurnt = (workout.getCalBurntPerUnitTime() / TimeUnit.SECONDS.toMillis(1));
		} else {
			calsBurnt = 0;
		}

		return calsBurnt * duration;
	}

}
