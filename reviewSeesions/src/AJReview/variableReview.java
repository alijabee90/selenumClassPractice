package AJReview;

import java.lang.ProcessHandle.Info;

import stringReview.stringReview;

public class variableReview {

	public static void main(String[] args) {
	/*	int a;
		a =12;
		int c=10, d=10, e=10;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);*/
		
		/*int X = 3; 
		int A = 32;
		String Y;
		Y = " ali ";
		System.out.println("Hello MY Name is"  + Y + "And MY AGE is "+ A + " My favort number is " + X);*/
		
	/*	String name= "Ali";
		String massage= " Hello my name is Ali";
		System.out.println(); 
		*/
		
		
		/*boolean A = true;
		double B = 5.99;
		String name = "Ajay";
		char z = 'B';
		int count = 209329;
		int quantity = 10;
		long bignumber = 1939123902232323232L;
		short smallNumber = 32000;
		boolean x = false;
		String code = "cd23232345i";*/
		
		/*double pi = 3.14;
        double r = 5;
        double areaOfCircle = pi * r * r;
        
        System.out.println("The area of the circle is equal to " + areaOfCircle + " meters.");*/
        
     /*   int value = 50;
        double another_value = 30.2;
        // Convert the variable value to a double
        double value_double = value;
        // Finally, Sum the variables
        double sum_value = value_double + another_value;
        // Print the result
        System.out.println(sum_value);*/
		
		
       /*  String str = "Java Exercises!";
        
        char charAtPosition5 = str.charAt(5);
        char charAtPosition10 = str.charAt(12);
        
        System.out.println("The character at position 0 is " + charAtPosition0);
        System.out.println("The character at position 10 is " + charAtPosition10);*/
		
        /*String str1 = "PHP Exercises and";
        String str2 = "Python Exercises";
        String concatenatedString = str1.concat(str2);
        System.out.println("The concatenated string: " + concatenatedString);
        System.out.println(concatenatedString.contains("and"));*/
		
		  String originalString = "Thank you for your order, the order number is 1237489384757. You will receive an email confirmation shortly.";
	        
	        
	        String orderNumberString = originalString.replaceAll("[^0-9]", "");
	        long orderNumber = Long.parseLong(orderNumberString);
	        
	       
	        String query = "SELECT * FROM orders WHERE order_id = " + orderNumber + ";";
	        
	        System.out.println("Query value: " + query);
        
			}

}
