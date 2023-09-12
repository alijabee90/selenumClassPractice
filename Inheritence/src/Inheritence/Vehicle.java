package Inheritence;

public class Vehicle {
	
	private int year;
	
	void fuelAmount() {
		System.out.println("The vheicle has fuel");
	}
	
	void capacity() {
		System.out.println("The vheicle has seats");
	}
	
	void applyBrakes() {
		System.out.println("The vheicle has stopped");
	}
	
	
	void setYear(int newYear) {
		this.year = newYear;
	}
	
	int getYear() {
		return this.year;
	}

}

class Bus extends Vehicle{
	
}

class Car extends Vehicle{
	
}

class Truck extends Vehicle{
	
}
