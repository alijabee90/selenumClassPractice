package objects;

public class demo5 {

	public static void main(String[] args) {


Book b1 = new Book();
b1.setTitle("Potorkic Araj");
b1.setAuthor("Anushavan Poghosyan");
	
System.out.println(b1.getTitle() + " " + b1.getAuthor() + " " );
		
Book b2 = new Book("Harry Potter", "Joanne R.", 52787);
System.out.println(b2.getTitle() + " " + b2.getAuthor() + " " );
		
Book b3 = new Book("Game of thrones", "Random name");
 Book b4= new Book();
 b4.setTitle("Another Book");

	}

}
