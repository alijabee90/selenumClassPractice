package Polymorphisism;

public class demoAnimal1 {

	public static void main(String[] args) {
	
          Animal1 a1 = new Dog ();
          Animal1 a2 = new Cat ();
          Animal1 a3 = new Duck();
          
          a1.sound();
          a1. eat();
          
          a2.sound();
          a2.eat();
          
          a3.sound();
          a3.eat();
	}

}
