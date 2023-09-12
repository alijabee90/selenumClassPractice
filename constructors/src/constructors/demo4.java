package constructors;

public class demo4 {

	public static void main(String[] args) {
/*Student myStudent = new Student("Mark", "Johnson", "11th");//arg constructor
		
		myStudent.printAll();
		
		Student myStudent2 = new Student(); //no arg constructor
		
		myStudent2.setFirstName("Kyle");
		myStudent2.setLastName("Richards");
		myStudent2.setGradeLevel("10th");
		
		System.out.println(myStudent2.getFirstName());
		System.out.println(myStudent2.getLastName());
		System.out.println(myStudent2.getGradeLevel());
		
		myStudent2.printAll();
		
		Student myStudent3 = new Student("Alex", "Hanson" , "12th"); //arg constructor
		
		myStudent3.printAll();
		
		Student myStudent4 = new Student();//no arg constructor
		
		myStudent4.printAll();*/
		
        person p1 = new person();
		
		person p2 = new person("Alex");
		
		person p3 = new person(25, "David");
	}
}

