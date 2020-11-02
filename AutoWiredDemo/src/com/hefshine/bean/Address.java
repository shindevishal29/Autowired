package com.hefshine.bean;

public class Address {
	private String city;
	private String state;

	private String contry;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String state, String contry) {
		super();
		this.city = city;
		this.state = state;
		this.contry = contry;
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

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", contry=" + contry + "]";
	}
	
	public void display() {
	
	System.out.println(city+ " "+state+ " "+contry);
		
	}
}
