package com.main.vehicle.service;

import java.util.List;

import com.rentcloud.domain.model.Customer;
import com.rentcloud.domain.model.Vehicle;

public interface VehicleService {

	Vehicle save(Vehicle vehicle);
	
	List<Vehicle> getAllVehicle();

}
