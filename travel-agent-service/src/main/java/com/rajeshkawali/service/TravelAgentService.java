package com.rajeshkawali.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rajeshkawali.dao.TravelAgentDao;
import com.rajeshkawali.model.FlightStatus;
import com.rajeshkawali.model.HotelBooking;
import com.rajeshkawali.model.Tourist;

@Service
public class TravelAgentService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	TravelAgentDao travelAgentDao;

	public FlightStatus getTouristFlightBooking(Integer touristId) {
		FlightStatus flights = restTemplate.getForObject("http://flight-service/flight/status/"+touristId, FlightStatus.class);
		return flights;
	}

	public List<FlightStatus> getAllFlights() {
		ResponseEntity<FlightStatus[]> response = restTemplate.getForEntity("http://flight-service/flight/all", FlightStatus[].class);
		FlightStatus[] allFlights = response.getBody();
		return Arrays.asList(allFlights);
	}
	
	public Tourist getTouristBookings(Integer touristId) {
		return travelAgentDao.getTouristBookings(touristId);
	}
	
	public List<Tourist> getAllTouristList(){
		return travelAgentDao.getAllTouristList();
	}

	public HotelBooking getHotelBooking(Integer touristId) {
		HotelBooking hotel = restTemplate.getForObject("http://hotel-service/hotel/"+touristId, HotelBooking.class);
		return hotel;
	}

	public List<HotelBooking> getAllHotels() {
		ResponseEntity<HotelBooking[]> response = restTemplate.getForEntity("http://hotel-service/hotel/all", HotelBooking[].class);
		HotelBooking[] allFlights = response.getBody();
		return Arrays.asList(allFlights);
	}
}
