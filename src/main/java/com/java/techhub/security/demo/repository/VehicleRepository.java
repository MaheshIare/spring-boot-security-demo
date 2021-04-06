/**
 * 
 */
package com.java.techhub.security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.techhub.security.demo.model.Vehicle;

/**
 * @author mahes
 *
 */
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
