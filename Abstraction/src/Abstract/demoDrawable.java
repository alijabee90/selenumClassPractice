package Abstract;

public class demoDrawable {

	public static void main(String[] args) {
		Drawable d1 = new Rectangle();
		d1.draw();
		d1.msg();
		
		System.out.println(Drawable.cube(3));
		
		
		Drawable d2 = new Circle();
		d2.draw();
		d2.msg();
		
		System.out.println(Drawable.cube(5));
		
		Drawable d3 = new Triangle();
		d3.draw();
		d3.msg();
		
		System.out.println(Drawable.cube(10));
	}
}