package com.workout.entity;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class WorkoutTransaction.
 */
@Entity
public class WorkoutTransaction implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The txn id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long txnId;
	
	/** The workout id. */
	private long  workoutId ;
	
	/** The start time. */
	private LocalDateTime   startTime ;
	
	/** The stop time. */
	private LocalDateTime    stopTime;
	
	/** The duration. */
	private Duration   duration  ;
	
	/** The cals burnt. */
	private double  calsBurnt ;
	
	/**
	 * Gets the workout id.
	 *
	 * @return the workout id
	 */
	public long getWorkoutId() {
		return workoutId;
	}
	
	/**
	 * Sets the workout id.
	 *
	 * @param workoutId the new workout id
	 */
	public void setWorkoutId(long workoutId) {
		this.workoutId = workoutId;
	}

	/**
	 * Gets the start time.
	 *
	 * @return the start time
	 */
	public LocalDateTime getStartTime() {
		return startTime;
	}
	
	/**
	 * Sets the start time.
	 *
	 * @param startTime the new start time
	 */
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	
	/**
	 * Gets the stop time.
	 *
	 * @return the stop time
	 */
	public LocalDateTime getStopTime() {
		return stopTime;
	}
	
	/**
	 * Sets the stop time.
	 *
	 * @param stopTime the new stop time
	 */
	public void setStopTime(LocalDateTime stopTime) {
		this.stopTime = stopTime;
	}
	
	/**
	 * Gets the duration.
	 *
	 * @return the duration
	 */
	public Duration getDuration() {
		return duration;
	}
	
	/**
	 * Sets the duration.
	 *
	 * @param duration the new duration
	 */
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	
	/**
	 * Gets the cals burnt.
	 *
	 * @return the cals burnt
	 */
	public double getCalsBurnt() {
		return calsBurnt;
	}
	
	/**
	 * Sets the cals burnt.
	 *
	 * @param calsBurnt the new cals burnt
	 */
	public void setCalsBurnt(double calsBurnt) {
		this.calsBurnt = calsBurnt;
	}
	
	/**
	 * Instantiates a new workout transaction.
	 *
	 * @param workoutId the workout id
	 * @param startTime the start time
	 * @param stopTime the stop time
	 * @param duration the duration
	 * @param calsBurnt the cals burnt
	 */
	public WorkoutTransaction(long workoutId,LocalDateTime startTime, LocalDateTime stopTime, Duration duration,
			double calsBurnt) {
		super();
		this.workoutId = workoutId;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.duration = duration;
		this.calsBurnt = calsBurnt;
	}
	
	/**
	 * Instantiates a new workout transaction.
	 */
	public WorkoutTransaction() {
	
	}
	
	
	
	
}
