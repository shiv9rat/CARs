package com.app.carbooking.dao;

import java.util.List;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.carbooking.entity.Car;

@Repository
public class CarBookingDAOImpl implements CarBookingDAO {
	@Autowired
	SessionFactory sessionFactory;
	@PostConstruct
	public void display() {
		System.out.println("sessionFactory created"); 
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Car> getAllCars() throws HibernateException {
		Session session = sessionFactory.openSession();
		List<Car> cars=null;
		cars = session.createCriteria(Car.class).list();
		//session.flush();
		session.close();
		return cars;
	}

	public Car getCarById(int carId) throws HibernateException {
		Session session = sessionFactory.openSession();
		Car car = (Car) session.createCriteria(Car.class).add(Restrictions.eq("id", carId)).list().get(0);
		session.close();
		return car;
	}

}
