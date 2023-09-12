package Polymorphisism;

public class demoPhone {

	public static void main(String[] args) {
		
		    
		Phone phone1 = new Nokia();
		Phone phone2 = new iPhone();
		Phone phone3 = new Android();
		
		phone1.checkOS();
		phone1.updateOS();
		
		phone2.checkOS();
		phone2.updateOS();
		
		phone3.checkOS();
		phone3.updateOS();   
		   
		
	}

}
