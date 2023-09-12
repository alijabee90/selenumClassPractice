package Abstract;



public abstract class Animal {
	
	Animal(){
		System.out.println("This is a new Animal");
	}
	
	public abstract void makeSound();
	
	public void eat() {
		System.out.println("I can eat");
	}
	
}

class Dog extends Animal{
	
	Dog(){
		super();
		System.out.println("This Animal is a Dog");
	}
	
	public void makeSound() {
		System.out.println("Bark Bark");
	}
}

class Cat extends Animal{
	
	Cat(){
		super();
		System.out.println("This Animal is a Cat");
	}
	
	public void makeSound() {
		System.out.println("Meow Meow");
	}
}

class Duck extends Animal{
	
	Duck(){
		super();
		System.out.println("This Animal is a Duck");
	}
	
	
	public void makeSound() {
		System.out.println("Quak Quak");
	}
}