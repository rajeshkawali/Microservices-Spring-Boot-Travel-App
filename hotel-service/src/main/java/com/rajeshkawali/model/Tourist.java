package com.rajeshkawali.model;

public class Tourist {

	private Integer touristId;
	private String name;
	private Integer age;
	private Boolean bookingStatus;

	public Tourist() {

	}

	public Tourist(Integer touristId, String name, Integer age, Boolean bookingStatus) {
		super();
		this.touristId = touristId;
		this.name = name;
		this.age = age;
		this.bookingStatus = bookingStatus;
	}

	public Integer getTouristId() {
		return touristId;
	}

	public void setTouristId(Integer touristId) {
		this.touristId = touristId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(Boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
}
