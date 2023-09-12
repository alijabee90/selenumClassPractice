package Abstract;

public interface Printable {
	void print();
}

interface Showable extends Printable{
	void show();
}

class A4Paper implements Showable{
	
	public void show() {
		System.out.println("Hello");
	}
	
	public void print() {
		System.out.println("Welcome");
	}
}
