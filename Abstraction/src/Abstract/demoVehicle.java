package Abstract;

public class demoVehicle {

	public static void main(String[] args) {
		
		Bike myBike = new Bike();
		myBike.changeGear(2);
		myBike.speedUp(3);
		myBike.applyBrakes(1);
		
		System.out.println("Bike present state: ");
		myBike.printStates();
		
		Bus myBus = new Bus();
		myBus.changeGear(4);
		myBus.speedUp(5);
		myBus.applyBrakes(3);
		
		System.out.println("Bus present state: ");
		myBus.printStates();
	}

}

