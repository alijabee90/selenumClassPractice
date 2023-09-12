package Polymorphisism;

public interface Shape {
void draw(); //abstract method
}


class Square implements Shape{
	public void draw() {
		System.out.println("Drawing sequare");
	}
}
		
		class Circle implements Shape{
			public void draw() {
				System.out.println("Drawing Circle");
			}
}
		class Hexagon implements Shape{
			public void draw() {
				System.out.println("Drawing Hexgon");
			}
		}
