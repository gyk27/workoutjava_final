package com.workout.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.workout.entity.User;
import com.workout.entity.Workout;


// TODO: Auto-generated Javadoc
/**
 * The Interface WorkoutRepository.
 */
@Transactional
public interface WorkoutRepository extends JpaRepository<Workout,Long> {
	
	/**
	 * Gets the workout.
	 *
	 * @param workoutId the workout id
	 * @return the workout
	 */
	@Query("from Workout wo where wo.workoutId=:workoutId")
	public Workout getWorkout (@Param("workoutId") long workoutId);
	
	/**
	 * Gets the workouts.
	 *
	 * @param userId the user id
	 * @return the workouts
	 */
	@Query("from Workout wo where  wo.userId=:userId")
	public List<Workout> getWorkouts (@Param("userId") long userId);

	
}
