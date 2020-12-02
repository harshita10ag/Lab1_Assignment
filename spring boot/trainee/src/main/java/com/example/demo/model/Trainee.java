package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;

@Entity(name = "trainee")
public class Trainee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long traineeId;
	@Value("HArshita")
	private String traineeName;
	@Value("java")
	private String traineeDomain;
	@Value("pune")
	private String traineeLocation;
	/**
	 * @return the traineeId
	 */
	public Long getTraineeId() {
		return traineeId;
	}
	/**
	 * @param traineeId the traineeId to set
	 */
	public void setTraineeId(Long traineeId) {
		this.traineeId = traineeId;
	}
	/**
	 * @return the traineeName
	 */
	public String getTraineeName() {
		return traineeName;
	}
	/**
	 * @param traineeName the traineeName to set
	 */
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	/**
	 * @return the traineeDomain
	 */
	public String getTraineeDomain() {
		return traineeDomain;
	}
	/**
	 * @param traineeDomain the traineeDomain to set
	 */
	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
	/**
	 * @return the traineeLocation
	 */
	public String getTraineeLocation() {
		return traineeLocation;
	}
	/**
	 * @param traineeLocation the traineeLocation to set
	 */
	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}
	

}
