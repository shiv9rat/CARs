package com.app.carbooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.carbooking.entity.Car;

@Service
public interface CarBookingService {
	
	List<Car> getAllCars();

	Car getCarById(int hotelId);

}
