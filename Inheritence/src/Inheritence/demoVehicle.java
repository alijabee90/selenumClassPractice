package Inheritence;


public class demoVehicle {

	public static void main(String[] args) {
		Vehicle myVehicle = new Vehicle();
		
		myVehicle.fuelAmount();
		
		myVehicle.capacity();
		
		myVehicle.applyBrakes();
		
		Bus myBus = new Bus();
		
		myBus.fuelAmount();
		
		myBus.capacity();
		
		myBus.applyBrakes();
		
		Car myCar = new Car();
		
		myCar.fuelAmount();
		
		myCar.capacity();
		
		myCar.applyBrakes();
		
		Truck myTruck = new Truck();
		
		myTruck.fuelAmount();
		
		myTruck.capacity();
		
		myTruck.applyBrakes();
		

		
		/*myVehicle.year = 2000;
		myBus.year = 1994;
		myCar.year = 2005;
		myTruck.year = 2013;
		
		System.out.println(myVehicle.year);
		System.out.println(myBus.year);
		System.out.println(myCar.year);
		System.out.println(myTruck.year);*/
		
		
		myVehicle.setYear(2000);
		myBus.setYear(1994);
		myCar.setYear(2005);
		myTruck.setYear(2013);
		
		System.out.println(myVehicle.getYear());
		System.out.println(myBus.getYear());
		System.out.println(myCar.getYear());
		System.out.println(myTruck.getYear());
	
		
	}

}
