package Polymorphisism;



public class Person {
	
		public void greet() {
			System.out.println("Greeting");
		}

	}

	class English extends Person{
		public void greet() {
			System.out.println("English Greeting");
		}
	}

	class German extends Person{
		public void greet() {
			System.out.println("German Greeting");
		}
	}

	class Arabic extends Person{
		public void greet() {
			System.out.println("Hala Walah");
		}
	}
