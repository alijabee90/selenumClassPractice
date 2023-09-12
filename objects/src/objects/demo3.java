package objects;
import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	/*	
		int input1;
		int input2;
		int input3;
		
		System.out.println("Enter a number here");
		input1 = keyboard.nextInt();
		
		System.out.println("Enter a number here");
		input2 = keyboard.nextInt();
		
		System.out.println("Enter a number here");
		input3 = keyboard.nextInt();
	
		String result1 = printStar(input1);		
		String result2 = printStar(input2);	
		String result3 = printStar(input3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		*/
/*Student s1 = new Student();
		
		s1.attendClass();
		
		s1.setFirstName("Mark");
		
		System.out.println("Student First name " + s1.getFirstName());
		
		s1.setLastName("Johnson");
		
		System.out.println("Student Last name " + s1.getLastName());
		
		s1.setAge(15);
		
		System.out.println("Student Age " + s1.getAge());
		*/
		
		/*phone p1 = new phone();
		
		p1.setBrand("iPhone");
		
		System.out.println(p1.getBrand());
		
		p1.setModel("14 Pro");
		
		System.out.println(p1.getModel());
		
		p1.setColor("Gold");
		
		System.out.println(p1.getColor());
		
		p1.printAll();*/
		
      /* car c1 = new car();
	   car c2 = new car();
		c1.setmake("Mercides");
		c1.setModel("C63");
		c1.setColor("Black");
		c2.setmake("BMW");
		c2.setModel("M4");
		c2.setColor("Green");
		c1.printAll();
		c2.printAll();*/
		
		/*dog d1 = new dog();
		dog d2 = new dog();
		dog d3 = new dog();
		
		d1.setBreed("German Shepard");
		d1.setSize("Large");
		d1.setAge(4);
		d1.setColor("White");

		System.out.println(d1.getBreed());
		System.out.println(d1.getSize());
		System.out.println(d1.getAge());
		System.out.println(d1.getColor());
		
		d1.printAll();
		
		d2.setBreed("Golden Retriver");
		d2.setSize("Medium");
		d2.setAge(5);
		d2.setColor("Golden");
		
		System.out.println(d2.getBreed());
		System.out.println(d2.getSize());
		System.out.println(d2.getAge());
		System.out.println(d2.getColor());
		
		d2.printAll();
		
		d3.setBreed("Dalmation");
		d3.setSize("Small");
		d3.setAge(1);
		d3.setColor("Black and White Spots");

		System.out.println(d3.getBreed());
		System.out.println(d3.getSize());
		System.out.println(d3.getAge());
		System.out.println(d3.getColor());
		
		d3.printAll();*/
		/*dog d1 = new dog();
		dog d2 = new dog();
		dog d3 = new dog();
		
		d1.setBreed("German Shepard");
		d1.setSize("Large");
		d1.setAge(4);
		d1.setColor("White");

		System.out.println(d1.getBreed());
		System.out.println(d1.getSize());
		System.out.println(d1.getAge());
		System.out.println(d1.getColor());
		
		d1.printAll();
		
		d2.setBreed("Golden Retriver");
		d2.setSize("Medium");
		d2.setAge(5);
		d2.setColor("Golden");
		
		System.out.println(d2.getBreed());
		System.out.println(d2.getSize());
		System.out.println(d2.getAge());
		System.out.println(d2.getColor());
		
		d2.printAll();
		
		d3.setBreed("Dalmation");
		d3.setSize("Small");
		d3.setAge(1);
		d3.setColor("Black and White Spots");

		System.out.println(d3.getBreed());
		System.out.println(d3.getSize());
		System.out.println(d3.getAge());
		System.out.println(d3.getColor());
		
		d3.printAll();*/
		
	/*	book b1 = new book();
		book b2 = new book();
		book b3 = new book();
		
		b1.setTitle("The Lord of the Rings");
		b1.setAuthor("J.R.R Tolkien");
		b1.setnumberOfPages(200);
		
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getNumberOfPages());
		
		b2.setTitle("Harry Potter");
		b2.setAuthor("J.K. Rowling");
		b2.setnumberOfPages(245);
		
		System.out.println(b2.getTitle());
		System.out.println(b2.getAuthor());
		System.out.println(b2.getNumberOfPages());
		
		b3.setTitle("It Starts with Us");
		b3.setAuthor("Collen Hoover");
		b3.setnumberOfPages(175);
		
		System.out.println(b3.getTitle());
		System.out.println(b3.getAuthor());
		System.out.println(b3.getNumberOfPages());;*/
		
		
	}
		
	public static String printStar(int number){
		String star = "";
		for (int i =0; i< number; i++) {
		star = star + "*";
	}
		return star;
		
		
		
}
}