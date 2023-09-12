package constructors;


public class person {
		
		
	public class Person {
		
		
		Person(String newName){
			this(20);//looks for constructor with these arguments
			this.name = newName;
			System.out.println("The persons name is " + this.name);
		}
		
		Person(int newAge, String newName){
			System.out.println("This is age then name");
			this.name = newName;
			this.age = newAge;
		}
		
		
		Person(String newName, int newAge){
			System.out.println("This is name then age");
			this.age = newAge;
			this.name = newName;
		}
		
		
		Person(int newAge){
			this.age = newAge;
			System.out.println("The age of this person is "+ this.age);
		}
		
		Person(){
			this("Kyle");//looks for constructor with these arguments
		}
		
		String name;
		int age;
		double height;

	}
} 

