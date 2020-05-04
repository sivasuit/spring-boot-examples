package com.main.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.main.vehicle.service.VehicleService;
import com.rentcloud.domain.model.Customer;
import com.rentcloud.domain.model.Vehicle;

@RestController
@RequestMapping(value = "/services")
public class VehicleController {

	@Autowired
	VehicleService vehicleService;

	@RequestMapping(value = "/vehicle", method = RequestMethod.POST)
	public Vehicle getProfile(@RequestBody Vehicle vehicle) {
		vehicle = vehicleService.save(vehicle);
		return vehicle;
	}
	
	
	@RequestMapping(value = "/vehicle", method = RequestMethod.GET)
	public List<Vehicle> getProfile() {
		System.out.println("List----------"+vehicleService.getAllVehicle());
		return vehicleService.getAllVehicle();
	}

}