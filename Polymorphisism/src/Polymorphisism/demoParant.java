package Polymorphisism;

public class demoParant {

	public static void main(String[] args) {
		Parent myParent = new Parent();
		Child myChild = new Child();
		
		myParent.setName("Johnson");
		myChild.setName("Matt");
		
		System.out.println(myParent.getName());
		System.out.println(myChild.getName());
		
		myChild.familyTime();
		myParent.familyTime();
	

	}

}
