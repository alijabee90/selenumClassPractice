package Abstract;

public class demoAnimal {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Duck d2 = new Duck();
		
		
		d1.makeSound();
		d1.eat();
		
		c1.makeSound();
		c1.eat();
		
		d2.makeSound();
		d2.eat();
		

	}

}
