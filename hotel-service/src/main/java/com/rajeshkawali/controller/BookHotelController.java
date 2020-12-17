package com.rajeshkawali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajeshkawali.model.HotelBooking;
import com.rajeshkawali.service.BookHotelService;

@RestController
@RequestMapping("/hotel")
public class BookHotelController {

	@Autowired
	BookHotelService bookHotelService;
	
	@GetMapping("/all")
	public List<HotelBooking> getAllBookings(){
		return bookHotelService.getAllBookings();
	}
	
	@RequestMapping("/{touristId}")
	public HotelBooking getSpecificTouristBookings(@PathVariable("touristId") Integer touristId){
		return bookHotelService.getSpecificTouristBookings(touristId);
	}
}
