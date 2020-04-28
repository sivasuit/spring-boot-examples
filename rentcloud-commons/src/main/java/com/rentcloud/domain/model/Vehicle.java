package com.rentcloud.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle")
public class Vehicle {

	@Id
	@GeneratedValue
	private int id;
	
	private String make;
	private String model;
	private String type;
	private int year;
}
