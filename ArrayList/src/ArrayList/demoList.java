package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;


public class demoList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("John"); //first element on index 0
		names.add("Harry"); // second element on index 1
		names.add("Jack"); //third element on index 2
		
		System.out.println(names);
		
		names.add(1, "Musa"); // fourth index on index 1
		names.add(0, "Ajay");
		
		System.out.println(names);//prints all elements
		
System.out.println("For Loop");
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("For Each");
		
		for(String name: names) {
			System.out.println(name);
		}
		
		
		System.out.println("Iterator");
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
          names.set(3 , "Robell");
		
		System.out.println(names);
		System.out.println(names.indexOf("John"));
		System.out.println(names.get(3));
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("John"); //first element on index 0
		names1.add("Harry"); // second element on index 1
		names1.add("Jack"); //third element on index 2
		
		
		
		
	}
	

}
