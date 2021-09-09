package com.javalec.function;

public class Car {
	
	//field
	public String company = "현대자동차";
	public String model;
	public String color;
	public int maxSpeed;
	//constructor
	public Car() {
		
	}
	public Car(String model) {
		super();
		this.model = model;
	}
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	public Car(String model, String color, int maxSpeed) {
		super();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	//method
}
