package Inheritence;

public class Pet {
	
	Pet(){
		System.out.println("This is your new pet");
	}

	String name;
	String color;
	private int age;
	
	void play() {
		System.out.println("The pet is playing");
	}
	
	void speak() {
		System.out.println("The pet spoke");
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	int getAge() {
		return this.age;
	}
}

class Dog extends Pet{
	
	Dog(){
		System.out.println("This is a dog");
	}
	
}

class Cat extends Pet{
	

}