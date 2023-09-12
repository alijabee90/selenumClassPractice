package stringpackage;

import java.util.Scanner;



		public class stringClass {

			public static void main(String[] args) {
				Scanner keyboard = new Scanner(System.in);
			
				String str = "java";//shares matching values with string pool
				String str2 = "java";//points to the same string pool as str
				
				str = "Javascript"; // creating a new string in the string pool 
				
				String str1 = new String("java");//allocates memory each time
				
				System.out.println(str);
				System.out.println(str1); 

			System.out.println( str1 + " is not the same as " + str);
			
			System.out.println(3 - 2 + 5);
			System.out.println (" march 13" + (20+21));
			
			System.out.println("987" + 6 + 5 );
			System.out.println("123" + (4+5));
			System.out.println( 3 + "4" + 5);
			System.out.println(3 +("4"+ 5));
			System.out.println(3 +4 +"5");
			System.out.println((3+4)+ "5");
			
			String name = "Mark";
			String years = "20";
			System.out.println("My name is " + name + " and I am " + years + " years old");
			
			String title = "javascript"; 
			String word = "java"; //adds 'java' to  the string pool
			String word2 = "java"; //word2 points to the same object as word
			String word3 = "Java"; //adds 'Java' to the string pool
			String word4 = "Java"; //word4 points to the same object as word3
			
			int length = word.length();
			
			System.out.println(length);
			
			System.out.println(title.charAt(0));
			
			char firstLetter = title.charAt(1); // firstLetter = a
			System.out.println(firstLetter);
			
			String word1 = "Java";
			int length0fword = word1.length(); //4
			System.out.println(word1.charAt(length0fword -1 )); //3
			System.out.println(word1.charAt(length0fword -2 ));
			System.out.println(word1.charAt(length0fword -3 ));
			System.out.println(word1.charAt(length0fword -4 ));
				
			String word11 = "Java";
			System.out.println(word11.toUpperCase());
			String worldAllCaps = word11.toUpperCase();
			System.out.println(worldAllCaps);
			word11 = "JAVA";
			System.out.println(word11.toLowerCase());
			String wordNoCaps = word11.toLowerCase();
			System.out.println(wordNoCaps);
				
				String bookTitle;
				System.out.println("Enter the name of the title here: ");
				bookTitle = keyboard.nextLine();
				System.out.println("The name of the book is: " + bookTitle.toUpperCase());
				
				System.out.println("Enter your name here: ");
				String name1 = keyboard.nextLine();
				System.out.println("The person's name is " + name1);
				name1 = name1.toUpperCase();
				System.out.println(name1 + " " + name1.length());
				
				String fruit = "Apple";
				System.out.println(fruit.substring (2));
				String cutFruit= fruit.substring(2);
				System.out.println(cutFruit);
				System.out.println(fruit.substring(1,4));
				
			    String sentence = "java is fun and easy to learn";
				System.out.println(sentence.indexOf("t"));
				
				String word8 = "Java";
				System.out.println(word11.replace("J", "w"));
				
				String word11 = "Java";
				System.out.println(word11.replace("J", "2"));
				
				String word20 = "java";
				
				System.out.println(word11.equals(word2));
				
				boolean truth = word11.equals(word2);
				
				
				
				System.out.println("Is word and word2 equal? the answer is: " +truth);
				
				String sentence1 = "java is fun and easy to learn";
				System.out.println(sentence1.indexOf("t"));
				
				String word111 = "Java";
				System.out.println(word111.replace("J", "2"));
				
				System.out.println(word111.equalsIgnoreCase(word2)); 
				
				String str3 = "Java";
				if(!str3.isEmpty()) {
					if(str3.length() > 3) {
						System.out.println("The length is " + str3.length());
	}

}
			}
		}
