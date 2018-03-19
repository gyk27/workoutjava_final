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

import com.workout.entity.Workout;
import com.workout.service.IWorkoutService;

// TODO: Auto-generated Javadoc
/**
 * The Class WorkoutRestController.
 */
@RestController
public class WorkoutRestController {
	
	/** The workout service. */
	@Autowired
	private IWorkoutService workoutService;

	/**
	 * Creates the workout.
	 *
	 * @param workout the workout
	 * @return the response entity
	 */
	@RequestMapping(value = "/createWorkout", method = RequestMethod.POST)
	public ResponseEntity<String> createWorkout(@RequestBody Workout workout) {
       try {
   		workoutService.createWorkout(workout);
	} catch (Exception e) {
		System.out.println("Exception happened while creating workout");
		e.printStackTrace();
	}
		return ResponseEntity.status(HttpStatus.CREATED).build();

	}

	/**
	 * Gets the workouts.
	 *
	 * @param userId the user id
	 * @return the workouts
	 */
	@RequestMapping(value = "/getWorkouts/{userId}", method = RequestMethod.GET)
	public List getWorkouts(@PathVariable long userId) {
		return workoutService.getWorkouts(userId);
	}
	
	/**
	 * Gets the workout.
	 *
	 * @param workoutId the workout id
	 * @return the workout
	 */
	@RequestMapping(value = "/getWorkout/{workoutId}", method = RequestMethod.GET)
	public Workout getWorkout(@PathVariable long workoutId) {

		return workoutService.getWorkout(workoutId);

	}

}
