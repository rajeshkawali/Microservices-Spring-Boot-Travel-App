package com.rajeshkawali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajeshkawali.model.FlightStatus;
import com.rajeshkawali.model.HotelBooking;
import com.rajeshkawali.service.BookFlightService;

@RestController
@RequestMapping("/flight")
public class BookFlightController {

	@Autowired
	BookFlightService bookFlightService;
	
	@GetMapping("/status/{touristId}")
    public FlightStatus getFlightStatusInfo(@PathVariable("touristId") Integer touristId) {
		return bookFlightService.getFlightStatusInfo(touristId);
	}
	
	@RequestMapping("/all")
    public List<FlightStatus> getAllFlightInfo() {
		return bookFlightService.getAllFlightInfo();
	}
	
	@RequestMapping("/{touristId}")
	public HotelBooking getTouristHotelBookingStatus(@PathVariable("touristId") Integer touristId){
		return bookFlightService.getTouristHotelBookingStatus(touristId);
	}
}
