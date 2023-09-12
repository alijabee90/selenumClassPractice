package Inheritence;

public class perent {
	public class Parent {

		private String name;
		private String hairColor;
		
		void setName(String newName) {
			this.name = newName;
		}
		
		String getName() {
			return this.name;
		}
		
		void setHairColor(String newHairColor) {
			this.hairColor = newHairColor;
		}
		
		String getHairColor() {
			return this.hairColor;
		}
		
		void familyTime() {
			System.out.println("The family is spending time together");
		}
		
		
		
		void display() {
			System.out.println("This is the parent class method");
		}
		
	}


	class Child extends Parent{
		
		private int age;
		
		void setAge(int newAge) {
			this.age = newAge;
		}
		
		int getAge() {
			return this.age;
		}
		
		void playTime() {
			System.out.println("The child is playing");
		}
		
		void display() {
			System.out.println("This is the child class method");
			super.display();
		}
		
	}
}
