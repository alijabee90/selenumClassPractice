package objects;

public class dog {
	
	private String breed;
	private String size;
	private int age;
	private String color;
	 boolean canPlay = false;



/*public void Eat() {
	System.out.println("The dog ate");
}

public void Sleep() {
	canPlay = true;
	System.out.println("The dog is Sleeping");
}

public void Run() {
	if(canPlay == true) {
		System.out.println("The dog is playing");
	}
	else {
		System.out.println("The dog needs to sleep");
	}*/
	

	public void setBreed(String newBreed) {
		breed = newBreed;
	}
	
	public void setSize(String newSize) {
		size = newSize;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public String getSize() {
		return size;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getColor() {
		return color;
	}
	
	public void printAll() {
		System.out.println("Breed:  " + breed + " Size:  " + size + " Age: " + age + " Color: " + color );
	}
	

	
	
}
