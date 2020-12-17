package com.rajeshkawali.model;

public class FlightStatus {

	private Integer flightNumber;
	private String from;
	private String to;
	private Integer touristId;

	public FlightStatus(Integer flightNumber, String from, String to, Integer touristId) {
		super();
		this.flightNumber = flightNumber;
		this.from = from;
		this.to = to;
		this.touristId = touristId;
	}

	public FlightStatus() {

	}

	public Integer getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Integer getTouristId() {
		return touristId;
	}

	public void setTouristId(Integer touristId) {
		this.touristId = touristId;
	}
}
