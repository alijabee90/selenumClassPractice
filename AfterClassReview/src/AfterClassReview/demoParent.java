package AfterClassReview;


public class demoParent {

	public static void main(String[] args) {
       
		child1 c1 = new child1();
		c1.setName("John");
		c1.haircolor = "black";
		c1.familyTime();
		c1.playTime();
		
		
		System.out.println(c1.getName() + " " + c1.haircolor);
	
		
	}
}
