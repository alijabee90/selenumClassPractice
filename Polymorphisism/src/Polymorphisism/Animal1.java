package Polymorphisism;

public abstract class Animal1 {
public void eat () {
	System.out.println("Animal Eating");
}
public abstract void sound ();

}

class Dog extends Animal1{
	public void sound () {
		System.out.println("woof");
}
}
class Cat extends Animal1{
	public void sound () {
		System.out.println("Meow");
	}
}
class Duck extends Animal1{
	public void sound () {
		System.out.println("Quak");
	}
	
}