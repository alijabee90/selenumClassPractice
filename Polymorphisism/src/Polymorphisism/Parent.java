package Polymorphisism;

public class Parent {

	String name;
	private String hairColor;
	
	void setName(String newName) {
		this.name = newName;
	}
	
	String getName() {
		return this.name;
	}
	
	void setHairColor(String newHairColor) {
		this.hairColor = newHairColor;
	}
	
	String getHairColor() {
		return this.hairColor;
	}
	
	void familyTime() {
		System.out.println(this.name + " is spending time with their child");
	}
	
	
	
	void display() {
		System.out.println("This is the parent class method");
	}
	
}


class Child extends Parent{
	
	
	private int age;
	
	
	
	
	
	void setAge(int newAge) {
		this.age = newAge;
	}
	
	int getAge() {
		return this.age;
	}
	
	void playTime() {
		System.out.println("The child is playing");
	}
	
	void display() {
		System.out.println("This is the child class method");
		super.display();
	}
	
	void familyTime() {
		System.out.println(this.name + " is playing with the parent");
	}
	
	
}