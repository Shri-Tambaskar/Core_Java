package com.mkpits.methods;

public class Details {
	
	private String name;
	private int id;
	private int pinCode,cityCode;
	
	public Details(String name, int id, int pinCode, int cityCode) {
		
		this.name = name;
		this.id = id;
		this.pinCode = pinCode;
		this.cityCode = cityCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getCityCode() {
		return cityCode;
	}

	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	
	

}
