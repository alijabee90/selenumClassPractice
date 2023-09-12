package Hashmap;

import java.util.HashMap;

public class hashTask {

	public static void main(String[] args) {
		HashMap<Integer,String> namesHash = new HashMap<Integer, String>();
		HashMap<Integer, String> employees = new HashMap<Integer, String>();
		employees.put(7, "Sarah");
		employees.put(4, "Jason");
		employees.put(3,  "Kevin");
		employees.put(5, "Tyson");
		employees.put(1, "Alex");
		employees.put(6, "Omar");
		employees.put(2, "Patrick");
		System.out.println(employees);
		
		HashMap<Integer,String> namesHash1 = new HashMap<Integer,String>(employees);
		namesHash1.put(2, "Micheal");
		namesHash1.put(11, "Joseph");
		System.out.println(namesHash1.containsValue("Tyson"));
		System.out.println(namesHash1.containsKey(6));
		System.out.println(namesHash1.size());
		System.out.println(namesHash1.get(6));
		System.out.println(namesHash1.get(3));
		System.out.println(namesHash1.get(7));
		System.out.println(namesHash1.get(5));
		System.out.println(namesHash1.get(1));
		System.out.println(namesHash1.get(11));
	}

}
