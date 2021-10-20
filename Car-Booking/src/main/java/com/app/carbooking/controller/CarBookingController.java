package com.app.carbooking.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.carbooking.entity.Car;
import com.app.carbooking.service.CarBookingService;
import com.app.carbooking.util.StringToDateConversion;

@Controller
public class CarBookingController {
	@Autowired
	CarBookingService carBookingService;// = new
													// HotelReservationServiceImpl();
	
	public CarBookingService getcarBookingService() {
		return carBookingService;
	}

	public void setCarBookingService(CarBookingService carBookingService) {
		this.carBookingService = carBookingService;
	}

	@RequestMapping("/searchCars")
	public String searchCars() {
		return "searchCars";
	}
	
	@RequestMapping("/success")
	public String success() {
		return "success";
	}

	@RequestMapping("/getCars")
	public ModelAndView getCars(HttpServletRequest request, HttpServletResponse response) {
	
		ModelAndView modelView = null;
		String searchcars = request.getParameter("searchcars");
		if (searchcars.isEmpty()) {
			modelView = new ModelAndView("searchCars");
			modelView.addObject("errorMessage", "Search String is empty, Please enter a valid search");
			return modelView;
		}
		modelView = new ModelAndView("Cars");
		List<Car> cars = null;
		try {
			cars = carBookingService.getAllCars();
		} catch (HibernateException hEx) {
			modelView = new ModelAndView("searchCars");
			modelView.addObject("errorMessage", "Please make sure Database is connected");
			return modelView;
		}

		List<Car> matchedCar = new ArrayList<Car>();
		for (Car car : cars) {
			System.out.println(car.getBrand());
			if (car.getBrand().matches("(.*)" + searchcars + "(.*)")) {
				matchedCar.add(car);
				System.out.println("Added to matched hotels " + car.getBrand());
			}
		}
		if (matchedCar.isEmpty()) {
			modelView = new ModelAndView("searchCars");
			modelView.addObject("errorMessage", "Sorry, Your search doesn't match any of the car models");
			return modelView;
		}
		modelView.addObject("cars", matchedCar);

		return modelView;
	}

	@RequestMapping("/getCar")
	public ModelAndView getCar(@RequestParam("id") int id) {
		ModelAndView modelView = new ModelAndView("Car");
		Car car = null;
		try {
			car = carBookingService.getCarById(id);
		} catch (HibernateException hEx) {
			modelView = new ModelAndView("Cars");
			modelView.addObject("Car",
					"U have done something wrong (Database disconnected) you Please make sure Database is connected");
			return modelView;
		}
		modelView.addObject("Car", car);
		return modelView;
	}

	

	


}
