package Expption;

public class task {

	public static void main(String[] args) {
		int[] myNumbers = {4,5,6};
		
		try {
		System.out.println(myNumbers[3]);
		}catch(Exception e) {
			System.out.println("Index 3 is out of bounds");
		}
		
		try {
			System.out.println(myNumbers[1] + " " + myNumbers[2]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Could not print these indexes because:");
			System.out.println(e.getMessage());
		}
		try {
			myNumbers[5] = 7;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Could not change the value of the index because:");
			e.printStackTrace();
		}
		finally {
			System.out.println(myNumbers[0]);
			System.out.println(myNumbers[1]);
			System.out.println(myNumbers[2]);
		}
	}

}
