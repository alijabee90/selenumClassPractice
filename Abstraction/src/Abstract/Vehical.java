package Abstract;

public interface Vehical {
	
		void changeGear(int a);
		void speedUp(int a);
		void applyBrakes(int a);
	}

	class Bike implements Vehical{
		int speed;
		int gear;
		
		public void changeGear(int newGear) {
			this.gear = newGear;
		}
		
		public void speedUp(int increment) {
			//this.speed = this.speed + increment;
			this.speed += increment;
		}
		
		public void applyBrakes(int decrement) {
			//this.speed = this.speed - decrement;
			this.speed -= decrement;
		}
		
		public void printStates() {
			System.out.println("Speed: " + this.speed + " gear: " + this.gear);
		}
	}

	class Bus implements Vehical{
		int speed;
		int gear;
		
		public void changeGear(int newGear) {
			this.gear = newGear;
		}
		
		public void speedUp(int increment) {
			this.speed = this.speed + increment;
		}
		
		public void applyBrakes(int decrement) {
			this.speed = this.speed - decrement;
		}
		
		public void printStates() {
			System.out.println("Speed: " + this.speed + " Gear: " + this.gear);
		}
	}
