package objects;

public class Student {

	String firstName;
	String lastName;
	String email;
	int age;
	String address;
	int batchNum;
	
	public void attendClass() {
		System.out.println("The student attended class");
	}
	
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	public void setLastName(String newLastName) {
		firstName = newLastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setAge (int newAge) {
		age=newAge;
	}
	public int getAge() {
		return age;
	}
}

