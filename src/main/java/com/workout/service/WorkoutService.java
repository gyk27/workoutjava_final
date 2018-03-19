package com.workout.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workout.entity.Workout;
import com.workout.repository.WorkoutRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class WorkoutService.
 */
@Service
public class WorkoutService implements IWorkoutService {
	
	/** The workout repository. */
	@Autowired
	WorkoutRepository  workoutRepository;
	
	/* (non-Javadoc)
	 * @see com.workout.service.IWorkoutService#getWorkouts(long)
	 */
	public List getWorkouts(long userId) {		
		return workoutRepository.getWorkouts(userId);
	}

	/* (non-Javadoc)
	 * @see com.workout.service.IWorkoutService#createWorkout(com.workout.entity.Workout)
	 */
	public long createWorkout(Workout workout) {
		return workoutRepository.save(workout).getWorkoutId();
		
	}
	
	/* (non-Javadoc)
	 * @see com.workout.service.IWorkoutService#getWorkout(long)
	 */
	public Workout getWorkout(long workoutId) {
		return workoutRepository.findOne(workoutId);
	}

}
