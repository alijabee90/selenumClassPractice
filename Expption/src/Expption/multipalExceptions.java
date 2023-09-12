package Expption;

public class multipalExceptions {

	public static void main(String[] args) {
		int num1,num2;
		try {
			num1 = 0;
			num2 = 62 / num1;// Arithmetic
			System.out.println(num2);
			System.out.println("This is the end of the try block");
		}catch(ArithmeticException e) {
			System.out.println("You can not divide a number by zero");
		}catch(Exception e) {
			System.out.println("Exception Occured");
		}
		
		System.out.println("I am out of the try catch block");
		int n1 = 5;
		int n2 = 0;
		try {
			System.out.println(n1/n2);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}  
		
		

	}

}
