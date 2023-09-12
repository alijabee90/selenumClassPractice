package constructors;

public class Student {
	
	
		
		Student(){
			System.out.println("This is a new Student");
			firstName = "John";
			lastName = "Doe";
			gradeLevel = "9th";
		}
		
		Student(String newFirstName, String newLastName, String newGradeLevel){
			System.out.println("This student has new data");
			firstName = newFirstName;
			lastName = newLastName;
			gradeLevel = newGradeLevel;
		}
		
		String firstName;
		String lastName;
		String gradeLevel;
		
		void setFirstName(String newFirstName) {
			this.firstName = newFirstName;
		}
		
		void setLastName(String newLastName) {
			this.lastName = newLastName;
		}
		
		void setGradeLevel(String newGradeLevel) {
			this.gradeLevel = newGradeLevel;
		}
		
		String getFirstName() {
			return this.firstName;
		}
		
		String getLastName() {
			return this.lastName;
		}
		
		String getGradeLevel() {
			return this.gradeLevel;
		}
		
		
		void printAll() {
			System.out.println("Name:" + firstName + " " + lastName + " " + gradeLevel + " Grade");
		}

	}

