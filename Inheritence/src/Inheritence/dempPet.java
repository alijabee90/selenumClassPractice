package Inheritence;

public class dempPet {
	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		Dog myDog2 = new Dog();
		Cat myCat = new Cat();
		
		myDog.name = "Spot";
		myDog.color = "Brown";
		
		myDog.setAge(5);
		System.out.println(myDog.getAge());
		
		myDog.play();
		myDog.speak();
		
		System.out.println(myDog.name + " " + myDog.color);
	}
}
