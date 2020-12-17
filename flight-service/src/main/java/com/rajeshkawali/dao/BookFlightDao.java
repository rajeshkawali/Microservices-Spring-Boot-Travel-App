package com.rajeshkawali.dao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.rajeshkawali.model.FlightStatus;

@Repository
public class BookFlightDao {

	List<FlightStatus> flightStatus = Arrays.asList(
			new FlightStatus(123, "Mumbai", "Bangalore", 1111),
			new FlightStatus(124, "Chennai", "Delhi", 1122), 
			new FlightStatus(125, "Mumbai", "America", 1133),
			new FlightStatus(127, "Patna", "Mumbai", 1155),
			new FlightStatus(126, "Pune", "Bangalore", 1144));

	public FlightStatus getFlightStatusInfo(Integer touristId) {
		 List<FlightStatus> touristStatus = flightStatus.stream()
				.filter(bookingStatus -> bookingStatus.getTouristId().equals(touristId)).collect(Collectors.toList());
		 if (touristStatus.size() != 1) {
			    throw new IllegalStateException();
			}
		 return touristStatus.get(0);
	}

	public List<FlightStatus> getAllFlightInfo() {
		return flightStatus;
	}
}
