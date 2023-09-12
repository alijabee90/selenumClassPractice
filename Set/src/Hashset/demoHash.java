package Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
public class demoHash {

	public static void main(String[] args) {
		
			/*	HashSet<String> names = new HashSet<String>();
				names.add("John");
				names.add("David");
				names.add("Harry");
				names.add("Harry");//overrides the old "Harry"
				names.add("John");//overrides the old "Harry"
				names.add("Ajay");
				names.add("Alex");
				names.add("Sarah");
				names.add("Alex");
				
				System.out.println(names);
				for(String name: names) {
					System.out.println(name);
				}*/
	/*	HashSet<String> people = new HashSet<String>();
		people.add("Patrick");
		people.add("David");
		people.add("Harry");
		people.add("Ajay");
		
		Object[] peopleArr = people.toArray();
		System.out.println(peopleArr[0]);
		System.out.println(peopleArr[1]);
		System.out.println(peopleArr[2]);
		System.out.println(peopleArr[3]);*/
		
	/*	HashSet<String> people = new HashSet<String>();
		people.add("Patrick");
		people.add("David");
		people.add("Harry");
		
		Iterator<String> iterator =  people.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
	/*	HashSet<String> people = new HashSet<String>();
		people.add("Patrick");
		people.add("David");
		people.add("Harry");
		ArrayList<String> peopleList = new ArrayList <> (people);
		System.out.println(peopleList.get(0));
		System.out.println(peopleList.get(1));
		System.out.println(peopleList.get(2));*/
		
		/*HashSet<String> employees = new HashSet<String>();
		employees.add("Sarah");
		employees.add("Jason");
		employees.add("Keven");
		employees.add("Tyson");
		employees.add("Alex");
		employees.add("Omar");
		employees.add("Patric");
		System.out.println(employees);
		for (String employee: employees ) {
			System.out.println(employee);*/
			
		/*	HashSet<String> employees = new HashSet<String>();
			employees.add("Sarah");
			employees.add("Jason");
			employees.add("Keven");
			employees.add("Tyson");
			employees.add("Alex");
			employees.add("Omar");
			employees.add("Patric");
			
			Object[] employeesArr = employees.toArray();
			System.out.println(employeesArr[2]);
			System.out.println(employeesArr[4]);
			System.out.println(employeesArr[6]);
			*/
		
		/*HashSet<String> names = new HashSet<String>();
		names.add("Harry");
		names.add("Harry");
		
		System.out.println(names);*/
		
		/*HashSet<String> names1 = new HashSet<String>();
		names1.add("Polat");
		names1.add("David");
		names1.add("Harry");
		ArrayList<String> otherNames = new ArrayList<String>();
		otherNames.add("Ajay");
		otherNames.add("Helil");
		names1.addAll(otherNames);
		
		System.out.println(names1);
		System.out.println(names1.contains("otherNames"));*/
		
		/*HashSet<String> names = new HashSet<String>();
		names.add("Polat");
		names.add("David");
		names.add("Harry");
		ArrayList<String> otherNames = new ArrayList<String>();
		otherNames.add("Harry");
		otherNames.add("Polat");
		otherNames.add("Robell");
		
		System.out.println(names.containsAll(otherNames));
		
		System.out.println(names.isEmpty());*/
		
		HashSet<String> shoppingCart = new HashSet<>();
		
		shoppingCart.add("Eggs");
		shoppingCart.add("Milk");
		shoppingCart.add("Bread");
		shoppingCart.add("Coffee");
		
		System.out.println(shoppingCart);
		
		shoppingCart.add("Banana");
		shoppingCart.add("Ice Cream");
		shoppingCart.add("Juice");
		shoppingCart.add("Red Wine");
		shoppingCart.add("Almond milk");
		shoppingCart.add("Ciroc apple");
		
		System.out.println("*******************");
		
		for(String item: shoppingCart) {
			System.out.println(item);
		}
		
		System.out.println("********************");
		
		Iterator<String> it = shoppingCart.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Iterator<String> it1 = shoppingCart.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("*********************");
		
		System.out.println(shoppingCart.contains("Ice Cream"));
		HashSet<String> newCart = new HashSet<String>();
		newCart.addAll(shoppingCart);
		newCart.remove("Milk");
		System.out.println(shoppingCart.containsAll(newCart));
		ArrayList<String> shoppingList = new ArrayList<String>();
		shoppingList.addAll(newCart);
		System.out.println(shoppingList.get(2));
		System.out.println(shoppingList.get(5));
		System.out.println(shoppingList.get(1));
		System.out.println(shoppingList.get(3));
		System.out.println(shoppingList.get(0));
		
			}

		}
		

	

