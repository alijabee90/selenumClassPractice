package constructors;

public class demoFrind {

	public static void main(String[] args) {
		Friend f1 = new Friend();
		Friend f2 = new Friend();
		f1.age = 20;
		f1.name = "Frank";
		
		f2.age = 30;
		f2.name = "Mark";
		
		
		Friend.lastName = "Johnson";
		
		System.out.println(Friend.lastName);
		
		a1("Addams");
		
	
		System.out.println(Friend.lastName);
		
		
		System.out.println(f1.age);
		System.out.println(f1.name);
		System.out.println(f2.age);
		System.out.println(f2.name);
		System.out.println(Friend.a);
	}

	private static void a1(String newLastName) {
		Friend.lastName = newLastName;
		
	}

	}


