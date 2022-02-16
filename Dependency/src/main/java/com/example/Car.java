package com.example;

public class Car implements Vehicle{
private String fuelType;
private int speed;

	public String getFuelType() {
	return fuelType;
}

public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

	public void move() {
		// TODO Auto-generated method stub
	System.out.println("car started");	
System.out.println("fuel type "+fuelType);
System.out.println("max speed "+speed);
	}

}
