/**
 * 
 */
package com.java.techhub.security.demo.service;

import java.util.List;

import com.java.techhub.security.demo.model.Vehicle;

/**
 * @author mahes
 *
 */
public interface VehicleService {

	Vehicle addVehicle(Vehicle vehicle);
	
	Vehicle getVehicle(Integer vehicleId);
	
	List<Vehicle> getAllVehicles();
	
	Vehicle updateVehicle(Integer vehicleId, Vehicle vehicle);
	
	String deleteVehicle(Integer vehicleId);
}
