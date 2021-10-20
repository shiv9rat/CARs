package com.app.carbooking.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "cars")
@Data
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private String model;
	private String year;
	private String kms;
	private String price;
	private String fuel;

	public Car() {
		super();
	}

	public Car(int id, String brand, String model, String year, String kms, String price, String fuel) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.kms = kms;
		this.price = price;
		this.fuel = fuel;
	}

	

}
