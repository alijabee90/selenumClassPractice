package Expption;

public class tryCathes {

	public static void main(String[] args) {
		try {
			int a[] = new int[7];
			a[4] = 30 / 0;//Exception
			System.out.println("First Print Statement in try block");
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occured");
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Out of bounds occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Some other exception occured");
			e.printStackTrace();
		}
		finally {
			System.out.println("This is finally block");
			System.out.println("THis will execute regardless of an exception or not");
		}

	}

}
