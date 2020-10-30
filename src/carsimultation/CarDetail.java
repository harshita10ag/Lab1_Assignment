package carsimultation;
/**
 * 
 * @author HARSHITA AGARWAL
 * car simulation
 *
 */
import java.util.*;
/**
 * get car name and car registration number
 *
 *
 */
public class CarDetail {
	private String name;
	private String registrationNumber;
	
	public CarDetail(String name, String registrationNumber) {
		this.name = name;
		this.registrationNumber = registrationNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getRegistrationNumber() {
		return this.registrationNumber;
	}
	

}