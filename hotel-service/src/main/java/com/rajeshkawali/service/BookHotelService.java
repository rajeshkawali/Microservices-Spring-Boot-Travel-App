package com.rajeshkawali.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajeshkawali.dao.BookHotelDao;
import com.rajeshkawali.model.HotelBooking;

@Service
public class BookHotelService {

	@Autowired
	BookHotelDao bookHotelDao;

	public List<HotelBooking> getAllBookings() {
		return bookHotelDao.getAllBookings();
	}

	public HotelBooking getSpecificTouristBookings(Integer touristId) {
		return bookHotelDao.getSpecificTouristBookings(touristId);
	}
}
