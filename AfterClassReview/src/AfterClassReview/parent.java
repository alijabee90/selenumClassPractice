package AfterClassReview;

public class parent {
	private String name;
	public String haircolor = "black";
	
	void familyTime() {
		System.out.println("family time");
	}
	
	void setName(String newName) {
		this.name = newName;
	}
	
	String getName() {
		return this.name;
	}
	
}
class child1 extends parent{
	public static char[] getName;

	void playTime() {
		System.out.println("It's play time");
	}
}
class child2 extends parent{
	
}
class child3 extends parent{
	
}