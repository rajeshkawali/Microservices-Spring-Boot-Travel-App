package com.rajeshkawali.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rajeshkawali.dao.BookFlightDao;
import com.rajeshkawali.model.FlightStatus;
import com.rajeshkawali.model.HotelBooking;

@Service
public class BookFlightService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	BookFlightDao bookFlightDao;

	public FlightStatus getFlightStatusInfo(Integer touristId) {
		return bookFlightDao.getFlightStatusInfo(touristId);

	}

	public List<FlightStatus> getAllFlightInfo() {
		return bookFlightDao.getAllFlightInfo();
	}
	
	public HotelBooking getTouristHotelBookingStatus(Integer touristId){
		HotelBooking hotelBookingStatus = restTemplate.getForObject("http://hotel-service/hotel/" + touristId , HotelBooking.class);
		return hotelBookingStatus;
	}
}
