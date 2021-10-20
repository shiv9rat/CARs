package com.app.carbooking.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.carbooking.entity.Car;

@Repository
public interface CarBookingDAO {

	List<Car> getAllCars();

	Car getCarById(int hotelId);

}
