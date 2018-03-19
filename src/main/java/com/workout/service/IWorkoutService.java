package com.workout.service;

import java.util.List;

import com.workout.entity.Workout;

// TODO: Auto-generated Javadoc
/**
 * The Interface IWorkoutService.
 */
public interface IWorkoutService {
	
	/**
	 * Gets the workouts.
	 *
	 * @param userId the user id
	 * @return the workouts
	 */
	public List getWorkouts(long userId);
	
	/**
	 * Gets the workout.
	 *
	 * @param workoutId the workout id
	 * @return the workout
	 */
	public Workout getWorkout(long workoutId);
	
	/**
	 * Creates the workout.
	 *
	 * @param workout the workout
	 * @return the long
	 */
	public long createWorkout(Workout workout);
	
}
