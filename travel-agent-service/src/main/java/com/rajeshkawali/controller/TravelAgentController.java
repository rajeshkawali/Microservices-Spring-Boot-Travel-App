package com.rajeshkawali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajeshkawali.model.FlightStatus;
import com.rajeshkawali.model.HotelBooking;
import com.rajeshkawali.model.Tourist;
import com.rajeshkawali.service.TravelAgentService;

@RestController
@RequestMapping("/travel")
public class TravelAgentController {

	
	@Autowired
	TravelAgentService travelAgentService;
	
	@GetMapping("/hotels")
	public List<HotelBooking> getAllHotels(){
		return travelAgentService.getAllHotels();
	}
	
	@GetMapping("/hotels/{touristId}")
	public HotelBooking getSpecificTouristBookings(@PathVariable("touristId") Integer touristId){
		return travelAgentService.getHotelBooking(touristId);
	}
	
	@GetMapping("/flights")
	public List<FlightStatus> getAllFlights(){
		return travelAgentService.getAllFlights();
	}
	@GetMapping("/{touristId}")
	public FlightStatus getTouristFlightBooking(@PathVariable("touristId") Integer touristId) {
		return travelAgentService.getTouristFlightBooking(touristId);
	}
	
	@GetMapping("/tourist/{touristId}")
	public Tourist getTouristBookings(@PathVariable("touristId") Integer touristId) {
		return travelAgentService.getTouristBookings(touristId);
	}
	
	@GetMapping("/tourist")
	public List<Tourist> getAllTouristList(){
		return travelAgentService.getAllTouristList();
	}
}
