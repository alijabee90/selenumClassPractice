package loopReview;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

import stringReview.stringReview;

public class reviewLoop {
 
	public static void main(String[] args) {
		
		for(int number = 1; number<=10; number++) {
			int numSquared = number * number;
			System.out.println(number + " " + numSquared);
		}
	}
		
		
		
       System.out.println("Even numbers between 1 and 30:");
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nOdd numbers between 1 and 30:");
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
               
            }
        System.out.print("Enter a number: ");


System.out.println("Multiplication table for " + i + ":");
for (int i1 = 1; i1 <= 5; i1++) {
    int result = i1 * i1;
    System.out.println(i1 + " x " + i1 + " = " + result);
}
        }
	}
	}
	
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = scanner.nextInt();
        for(int i = 1; i <= input; i++) {
        	int result = input * i;
        	System.out.println(i + " x " + input + " = " + result);
        }
	
		System.out.println("Even numbers between 1 and 30");
		for(int i = 1; i <= 30; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Odd numbers between 1 and 30");
		for(int i = 1; i <= 30; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		for(int i = 1; i <=30; i++) {
	        
            if (i % 2 == 0) {
                System.out.println("" + i + " is even");
            	} else {
                System.out.println("" + i + " is odd");
            	}
		}
	}
	
	
}		
		int number = 1; 
		while (number<=10){ 
					
					System.out.println(number * number);
		number++; 
				}
	}

		Scanner scanner = new Scanner(System.in);
		int input = 0;
		do {
			System.out.print("Enter an even number");
			input = scanner.nextInt();
		}while(input % 2 != 0);
		System.out.println("Even number entered");
		
	}



     int number = 0;
     int sum =0;
     while (number <= 20) {
	if (number % 2 == 0) {
		sum += number;
	}
	number++;
}
System.out.println("Sum of even numbers between 0 and 20" + sum);
	}


		Scanner scanner = new Scanner(System.in);String input = "";
		do {
			System.out.print("Enter the password\n");
			input = scanner.next();
		}while(!input.equals("password"));
		
	}

		
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
      continue;
    }
    System.out.println(i);
  }
}

		
		  
	      String[] fruits = new String[] { "orange", "apple", "pear", "strawberry" };
	        for (int i = fruits.length - 1; i >= 0; i--) {
	            System.out.println(fruits[i]);
	        }
	    }
	    }
	   

		
		



