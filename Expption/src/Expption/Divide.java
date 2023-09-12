package Expption;
import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Corrected variable name and input source
        
        System.out.println("Enter the first number:");
        int numb1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int numb2 = scanner.nextInt();
        
        try {
            int result = numb1 / numb2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { // Specific exception type for division by zero
            System.out.println("Error: Division by zero is not allowed");
        }

        System.out.println("This is the end of the program");
        
        scanner.close(); // Closing the scanner
    }
}