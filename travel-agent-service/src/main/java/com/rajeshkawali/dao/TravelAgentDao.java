package com.rajeshkawali.dao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.rajeshkawali.model.Tourist;

@Repository
public class TravelAgentDao {

	List<Tourist> touristList = Arrays.asList(
			new Tourist(1111,"Rajesh",30,true),
			new Tourist(1122,"Mahesh",28,false),
			new Tourist(1133,"Keshav",22,true),
			new Tourist(1144,"Vidya",27,true),
			new Tourist(1155,"Anand",40,false)
			);
	
	public List<Tourist> getAllTouristList(){
		return touristList;
	}

	public Tourist getTouristBookings(Integer touristId) {
		 List<Tourist> hotelBooking =  touristList.stream().filter(tourist -> tourist.getTouristId().equals(touristId)).collect(Collectors.toList());
		 if (hotelBooking.size() != 1) {
			    throw new IllegalStateException();
			}
		 return hotelBooking.get(0);
	}
}
