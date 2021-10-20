package com.app.carbooking.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.carbooking.dao.CarBookingDAO;
import com.app.carbooking.dao.CarBookingDAOImpl;
import com.app.carbooking.entity.Car;

@Service
public class CarBookingServiceImpl implements CarBookingService {
    @Autowired
	private CarBookingDAO reservationDaoImpl;// = new HotelReservationDAOImpl();
	@PostConstruct
	
	

	public CarBookingDAO getReservationDaoImpl() {
		return reservationDaoImpl;
	}

	public void setReservationDaoImpl(CarBookingDAO reservationDaoImpl) {
		this.reservationDaoImpl = reservationDaoImpl;
	}

	public List<Car> getAllCars() throws HibernateException {
		System.out.println(reservationDaoImpl);
		return reservationDaoImpl.getAllCars();
	}

	

	public Car getCarById(int carId) throws HibernateException {
		return reservationDaoImpl.getCarById(carId);
	}


}