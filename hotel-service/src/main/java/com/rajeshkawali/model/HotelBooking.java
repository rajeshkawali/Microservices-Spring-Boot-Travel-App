package com.rajeshkawali.model;

public class HotelBooking {

	private Integer roomNumber;
	private String place;
	private Integer touristId;
	
	public HotelBooking() {
		
	}
	
	public HotelBooking(Integer roomNumber, String place, Integer touristId) {
		super();
		this.roomNumber = roomNumber;
		this.place = place;
		this.touristId = touristId;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Integer getTouristId() {
		return touristId;
	}
	public void setTouristId(Integer touristId) {
		this.touristId = touristId;
	}
}
