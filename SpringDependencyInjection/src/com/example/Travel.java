package com.example;

public class Travel implements Journey {

	Vehicle v;

	public void setV(Vehicle v) {
		this.v = v;
	}

	@Override
	public void startJourney() {
		// TODO Auto-generated method stub
		System.out.println("starting journey");
		v.move();
	}
	
}
