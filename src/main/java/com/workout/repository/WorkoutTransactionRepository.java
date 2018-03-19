package com.workout.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.workout.entity.User;
import com.workout.entity.Workout;
import com.workout.entity.WorkoutTransaction;


// TODO: Auto-generated Javadoc
/**
 * The Interface WorkoutTransactionRepository.
 */
@Transactional
public interface WorkoutTransactionRepository extends JpaRepository<WorkoutTransaction,Long> {
	
	/* (non-Javadoc)
	 * @see org.springframework.data.jpa.repository.JpaRepository#findAll()
	 */
	List<WorkoutTransaction> findAll();
	
	/**
	 * Gets the workout transactions.
	 *
	 * @param workoutId the workout id
	 * @return the workout transactions
	 */
	@Query("from WorkoutTransaction wt where wt.workoutId=:workoutId")
	public List<WorkoutTransaction> getWorkoutTransactions (@Param("workoutId") long workoutId);

}

