package com.main.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.vehicle.repository.VehicleRepository;
import com.rentcloud.domain.model.Vehicle;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepository vehicleRepo;

	@Override
	public Vehicle save(Vehicle vehicle) {
		return vehicleRepo.save(vehicle);
	}

	@Override
	public List<Vehicle> getAllVehicle() {
		return vehicleRepo.findAll();
	}

}
