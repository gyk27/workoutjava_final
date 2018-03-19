package com.workout.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
// TODO: Auto-generated Javadoc

/**
 * The Class Workout.
 */
@Entity

public class Workout  implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The workout id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="workout_id")
	private long workoutId;
	

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
	
	/** The title. */
	private String title ;
	
	/** The cal burnt per unit time. */
	@Column(name="cal_burnt_per_unit_time")
	private double  calBurntPerUnitTime ;
	
	/** The unit time. */
	@Enumerated(EnumType.STRING)
	@Column(name="unit_time")
	private  UnitTime unitTime ;
	
	/** The user id. */
	@Column(name="user_id")
	private  long userId  ;
	
	/** The workout transaction. */
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="workoutId")
	private List<WorkoutTransaction> workoutTransaction=new ArrayList<WorkoutTransaction>();
	
	/**
	 * Instantiates a new workout.
	 *
	 * @param title the title
	 * @param calBurntPerUnitTime the cal burnt per unit time
	 * @param unitTime the unit time
	 * @param userId the user id
	 */
	public Workout(String title, double calBurntPerUnitTime, UnitTime unitTime, long userId) {
		super();
		this.title = title;
		this.calBurntPerUnitTime = calBurntPerUnitTime;
		this.unitTime = unitTime;
		this.userId = userId;
	}
	
	/**
	 * Instantiates a new workout.
	 */
	public Workout() {
	
	}
	
	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Gets the cal burnt per unit time.
	 *
	 * @return the cal burnt per unit time
	 */
	public double getCalBurntPerUnitTime() {
		return calBurntPerUnitTime;
	}
	
	/**
	 * Sets the cal burnt per unit time.
	 *
	 * @param calBurntPerUnitTime the new cal burnt per unit time
	 */
	public void setCalBurntPerUnitTime(double calBurntPerUnitTime) {
		this.calBurntPerUnitTime = calBurntPerUnitTime;
	}
	
	/**
	 * Gets the unit time.
	 *
	 * @return the unit time
	 */
	public UnitTime getUnitTime() {
		return unitTime;
	}
	
	/**
	 * Sets the unit time.
	 *
	 * @param unitTime the new unit time
	 */
	public void setUnitTime(UnitTime unitTime) {
		this.unitTime = unitTime;
	}
	
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public long getUserId() {
		return userId;
	}
	
	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	
}
