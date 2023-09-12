package setmapReview;
import java.util.*;
import java.util.Map.Entry;


public class setMapDemo {

	public static void main(String[] args) {
	/*	HashSet<String> names = new HashSet<String>();
				
				names.add("Steve");
				names.add("Joe");
				names.add("Bob");
				names.add("Sawsan");
				names.add("Valentina");
				names.add("Steve");
				
				System.out.println(names);
				
				HashSet<Integer> numbers = new HashSet<Integer>();
				numbers.add(1);
				numbers.add(3);
				numbers.add(5);
				numbers.add(5);
				numbers.add(5);
				numbers.add(9);
				numbers.add(9);
				numbers.add(9);
				
				System.out.println(numbers);
				
				for(String name: names) {
				System.out.println(name);
				}
				for(Integer number: numbers) {
					System.out.println(number);
					
					
				}*/
/*HashSet<String> names = new HashSet<String>();
		
		names.add("Steve");
		names.add("Joe");
		names.add("Bob");
		names.add("Sawsan");
		names.add("Valentina");
		names.add("Steve");
		
		System.out.println(names);
		
		for(String name: names) {
			System.out.println(name);
		}
		
		Object[] namesArr = names.toArray(); //Gives you an Object Array
		System.out.println("To Array at index 1: " + namesArr[1]);
		Iterator<String> namesIt = names.iterator();
		System.out.println("Iterator");
		while(namesIt.hasNext()) {
			System.out.println(namesIt.next());


			
			HashSet<String> named = new HashSet<String>();
			named.add("Polat");
			named.add("David");
			named.add("Harry");
			ArrayList<String> otherNames = new ArrayList<String>();
			otherNames.add("Jack");
			otherNames.add("Abdu");
			named.addAll(otherNames);
			System.out.println(named);
			
			HashSet<String> named1 = new HashSet<String>();
			named1.add("Polat");
			named1.add("David");
			named1.add("Harry");
			ArrayList<String> otherNames1 = new ArrayList<String>();
			otherNames1.add("Jack");
			otherNames1.add("Abdu");
			named1.addAll(otherNames1);
			System.out.println(named1);
			
			ArrayList<String> listToRemove = new ArrayList<String>(); 
			listToRemove.add("Polat");
			listToRemove.add("John");
			//[Polat, John]
			
			System.out.println(named1.containsAll(listToRemove));
			
			//[Harry, David, Polat, Jack, Abdu]
			named1.removeAll(listToRemove);
			System.out.println(named1);
			//[Harry, David, Jack, Abdu]
			
			String[] arr = new String[named1.size()];
			arr = named1.toArray(arr);
			System.out.println("toArray: " + Arrays.toString(arr));
			
			TreeSet ts = new TreeSet();
			ts.addAll(named1);
			System.out.println(ts); //Sorts in ascending order due to TreeSet
			
			TreeSet nums = new TreeSet();
			nums.add(1);
			nums.add(0);
			nums.add(6);
			nums.add(2);
			nums.add(6);
			System.out.println("TreeSet nums: " + nums); //Sorts in ascending order due to TreeSet
			
			LinkedHashSet<Integer> lhsNumbers = new LinkedHashSet<Integer>();
			lhsNumbers.add(9);
			lhsNumbers.add(1);
			lhsNumbers.add(3);
			lhsNumbers.add(6);
			lhsNumbers.add(4);
			lhsNumbers.add(3);
			System.out.println(lhsNumbers);
			
			
			
			
		}*/
		
		
		/*int[] nums = {1,2,3,4,5,6,7,8,9};
		int[] reverseNums = new int[nums.length];
		
		int totalLength = nums.length - 1;
		for(int i = nums.length - 1; i>=0; i--) {
			reverseNums[totalLength - i] = nums[i];
			System.out.println(nums[i]);
		}*/
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(3, "John");
		map.put(1, "Valentina");
		map.put(7, "Sahar");
		
		map.put(7, "Bob");
		System.out.println(map);
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "Ali");
		map2.put(4, "Jeff");
		System.out.println("Contains Ali " + map2.containsValue("Ali"));
		map2.putAll(map);
		System.out.println("Contains Ali " + map2.containsValue("Ali"));
		
		System.out.println(map2);
		System.out.println(map2.containsKey(3));
		map2.remove(3);
		System.out.println(map2);
		System.out.println(map2.containsKey(3));
		System.out.println(map2.get(1));
		
		Set<Integer> keys = map2.keySet();
		System.out.println(keys);
		
		ArrayList<String> values = new ArrayList(map2.values());
		System.out.println(values);
		
		Set<Entry<Integer,String>> entries = map2.entrySet();
		for(Entry<Integer,String> entry: entries) {
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}
		
			}
		
	}

