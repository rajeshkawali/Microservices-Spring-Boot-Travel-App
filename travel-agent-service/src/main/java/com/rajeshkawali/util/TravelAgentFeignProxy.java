package com.rajeshkawali.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rajeshkawali.model.HotelBooking;

@FeignClient(name ="hotel-service")
public interface TravelAgentFeignProxy {

	@GetMapping("/hotel/{touristId}")
	public HotelBooking getSpecificTouristHotelBookingUsingFeign(@PathVariable("touristId") Integer touristId);
}
