package Inheritence;

public class A {
	
	int number;
	String word;
	
	void run() {
		System.out.println("This method works");
	}

}

class B extends A {
	
	double mixedNumber;
	
	void test() {
		System.out.println("This method is testing");
	}
	
}

class C extends B {
	
	boolean value;
	
	void execute() {
		System.out.println("This method is executed");
	}
}