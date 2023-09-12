package Hashset;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
public class hashrecap {

	public static void main(String[] args) {
		/*HashSet<String> names = new HashSet<String>();
		names.add("John");
		names.add("David");
		names.add("Harry");
		names.add("Harry");
		System.out.println(names);
		HashSet<String> names2 = new HashSet<String>();
		names2.add("Ajay");
		names2.add("Robell");
		names2.add("Helil");
		names2.addAll(names);
		names.addAll(names2);
		System.out.println(names2);
		System.out.println(names);
		names.remove("Helil");
		System.out.println(names);//removed Helil
		//names2.removeAll(names);
		System.out.println(names2);
		System.out.println(names2.contains("Helil"));
		System.out.println(names2.containsAll(names));
		names.clear();
		System.out.println(names.isEmpty());*/
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(9);
		numbers.add(1);
		numbers.add(3);
		numbers.add(7);
		
		ArrayList<Integer> numberList = new ArrayList<Integer>(numbers);
		
		Collections.sort(numberList);
		System.out.println("Ascending Order: " + numberList);
		
		Collections.sort(numberList, Collections.reverseOrder());
		System.out.println("Desending Order: " + numberList);
		 
	}

}
