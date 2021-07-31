package com.model;

public class ContactDetails {
	private String firstName;
	private String lastName;
	private String area;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;

	public ContactDetails(String firstName, String lastName, String area, String city, String state, String zip,
			String phoneNumber, String email) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.area = area;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Details of: " + firstName + " " + lastName + "\n" + "Address: " + area + "\n" + "City: " + city + "\n"
				+ "State: " + state + "\n" + "Zip: " + zip + "\n" + "Phone Number: " + phoneNumber + "\n" + "Email: "
				+ email;
	}
}
