package com.learning.entity;

public class Address {
	private String houseNo;
	private String society;
	private String street;
	private String city;
	private String state;
	
	public Address() {
		super();
	}

	public Address(String houseNo, String society, String street, String city,
			String state) {
		super();
		this.houseNo = houseNo;
		this.society = society;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getSociety() {
		return society;
	}

	public void setSociety(String society) {
		this.society = society;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "houseNo="
				+ houseNo
				+ "\nsociety="
				+ society
				+ "\nstreet="
				+ street
				+ "\ncity="
				+ city
				+ "\nstate="
				+ state;
	}
}