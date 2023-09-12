package Hashset;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
public class hashSort {

	public static void main(String[] args) {
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(4);
		numbers.add(1);
		numbers.add(5);
		numbers.add(2);
		
		ArrayList<Integer> numberList = new ArrayList<>(numbers);
		
			
		Collections.sort(numberList);
		
		System.out.println("Asending Order: " + numberList);
		
		Collections.sort(numberList, Collections.reverseOrder());
		
		System.out.println("Desending Order: " + numberList);
		

	}

}
