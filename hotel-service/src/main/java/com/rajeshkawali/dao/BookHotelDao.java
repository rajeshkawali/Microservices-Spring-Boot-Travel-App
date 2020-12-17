package com.rajeshkawali.dao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.rajeshkawali.model.HotelBooking;
import com.rajeshkawali.model.Tourist;

@Repository
public class BookHotelDao {

	List<Tourist> touristList = Arrays.asList(
			new Tourist(1111,"Rajesh",30,true),
			new Tourist(1111,"Mahesh",28,false),
			new Tourist(1111,"Keshav",22,true),
			new Tourist(1111,"Vidya",27,true),
			new Tourist(1111,"Anand",40,false)
			);
	
	List<HotelBooking> hotelBookingList = Arrays.asList(
			new HotelBooking(9911,"Mumbai",1111),
			new HotelBooking(9922,"Bangalore",1122),
			new HotelBooking(9933,"Delhi",1133),
			new HotelBooking(9944,"Pune",1144)
			);
	
	public List<HotelBooking> getAllBookings(){
		return hotelBookingList;
	}
	
	public List<Tourist> getAllTouristList(){
		return touristList;
	}

	public HotelBooking getSpecificTouristBookings(Integer touristId) {
		System.out.println("touristId-->"+touristId);
		 List<HotelBooking> hotelBooking =  hotelBookingList.stream().filter(tourist -> tourist.getTouristId().equals(touristId)).collect(Collectors.toList());
		 if (hotelBooking.size() != 1) {
			    throw new IllegalStateException();
			}
		 return hotelBooking.get(0);
	}
}
