package Polymorphisism;

public class demoShape {

	public static void main(String[] args) {
		Shape shape1 = new Square();
        Shape shape2= new Circle();
        Shape shape3 = new Hexagon();
        
        shape1.draw();
        shape2.draw();
        shape3.draw();
	}

}
