package stringReview;
import java.util.Scanner;

public class stringReview {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int number = 17;
		boolean value = false;
		
		  String name = "MArk";
		 
		    String title = new String("Titanic");// adds the string to the heap
			String title2 = new String("Titanic");// adds another string to the heap
			String title3 = new String("Titanic");// adds another string to the heap
			
			String name1 = "Mark"; //stores the string in the pool
			String name2 = "Mark";//name2 points to the same string as name
			String name3 = "Mark";//name3 points to the same string as name
			String name4 = "John";//stores the string in the pool
	 		String name5 = "John";//name5 points to the same string as name4
	 		
	 		
	 		String name6 = "Robell";
			String years = "22";
			System.out.println("My name is " + name6 + " and I am " + years + " old");
			
			boolean value1 = false;
			
			System.out.println("The value is " + value1);
			
			
			System.out.println("March 13 " + 20 + 21);
			//string + string + string

             System.out.println("March 13 " + (20 + 21));
			//string + (integer + integer)

             System.out.println(6 + (" and " + 7));
		
		String person = "Micheal";
		System.out.println(person.length());
		
		int length = person.length() - 2;
		
		System.out.println(length);
		
        System.out.println(person.charAt(5));
		
		char letter = person.charAt(length - 2);
			
		System.out.println(letter);
		
        System.out.println("What is your name?");
		
		String name1 = keyboard.nextLine();
		
		char firstLetter = name1.charAt(0);
		int length1 = name1.length();
		int value11 = name1.indexOf(firstLetter);
		
		
		System.out.println(firstLetter + " is the first letter " + length1 + " is the length and " + value11 + " is the beginnig");
		
		System.out.println(name1.toUpperCase());// prints out string all uppercase
		System.out.println(name1.toLowerCase());// prints out string all lowercase
		
		String nameUpperCase = name1.toUpperCase();//stores uppercase string into new string
		String nameLowerCase = name1.toLowerCase();//stores lowercase string into new string
		
	String name21 = "Matthew";
		
		System.out.println(name21.substring(4));
	
		
		System.out.println(name21.substring(1,5));
		String name211 = "Matthew";
		
		System.out.println(name211.substring(4));
	
		
		System.out.println(name211.substring(1,5));
		
		System.out.println(name211.indexOf("t"));
		
		System.out.println(name211.lastIndexOf("t"));
		
		System.out.println(name211.replace("t","s"));
		System.out.println(name211.equals("Matthew"));
		System.out.println(name211.equalsIgnoreCase("Matthew"));
		
		}
	}
	

}
