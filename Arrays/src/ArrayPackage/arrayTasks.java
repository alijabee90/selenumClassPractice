package ArrayPackage;
import java.util.Scanner;

import javax.print.attribute.standard.NumberUpSupported;

import java.beans.JavaBean;
import java.util.Arrays;

public class arrayTasks {

	private Object employees;

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
		
		
	/*int [] numbers = {1,2,3,4,5};
		for (int number: numbers) {
			System.out.print(number);
		}*/
	
		//String[]employees = {"Alex", "Omar", "Patrick"};
		/*System.out.println("Enter the index of the employee:");
		int index = keyboard.nextInt();
		System.out.println(employees[index]);*/
	
	/*	employees[0] = "Suzie"; //Alex
		employees[2] = "AJ";    //Patrick
		employees[1] = "Katie";	//Omar
		
		for(String employee: employees) {
			System.out.println(employee);
		}
	int[] numbers = new int [10];
	for(int i =0; i < numbers. length; i++) {
		numbers [i]= 10-i;
	}
	System.out.println(java.util.Arrays.toString(numbers));
      //[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
	
	java.util.Arrays.sort(numbers);
	
	System.out.println(java.util.Arrays.toString(numbers));
	int index = Arrays.binarySearch(numbers,9);
	System.out.println(index);*/
	
	
	
	/*int[] numbers = new int[10];
	
	for(int i = 0; i < numbers.length; i++) {
		numbers[i] = i + 1;
	}
	
	
	int[] reverse = new int[10];
	
	for(int i = 0; i < reverse.length; i++) {
		reverse[i] = 10 - i;
	}
	
	System.out.println(java.util.Arrays.toString(numbers));
	
	System.out.println(java.util.Arrays.toString(reverse));
	
	boolean check = Arrays.equals(numbers, reverse);
	
	
	System.out.println(check);
	
	java.util.Arrays.sort(reverse);
	
	System.out.println(java.util.Arrays.toString(reverse));
	
	check = Arrays.equals(numbers, reverse);
	
	System.out.println(check);*/
	
	/*int[] numbers = {5,4,3,2,1};
	
	System.out.println(java.util.Arrays.toString(numbers));
	
	java.util.Arrays.sort(numbers);
	
	System.out.println(java.util.Arrays.toString(numbers));
		
		
	String[] employees = {"Sarah", "Jason", "Kevin", "Tyson", "Alex", "Omar", "Patrick"}; 
	
	java.util.Arrays.sort(employees);
	
	System.out.println(java.util.Arrays.toString(employees));*/
		
		
		String[] employees = {"Alex","Omar","patric",};
		String[] newEmployees= Arrays.copyOf(employees,employees.length * 2);
		newEmployees [3] = "Suzie";
		newEmployees [4]= "AJ";
		newEmployees [5]= "katie";
		Arrays.sort(newEmployees);
		System.out.println(Arrays.toString(newEmployees));
	}

}
