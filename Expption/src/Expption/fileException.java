package Expption;

public class fileException {

	public static void main(String[] args) {
		try {
		int result = 10 / 0;//Arithmetic Exception
		System.out.println(result);
		}catch (Exception e) {
			System.out.println("You cannot divide any number by zero");
		}
		try {
		String name = null;
		int index = name.indexOf("a");//Null Pointer Exception
		System.out.println(index);
		}catch (Exception e) {
			System.out.println("The string name is null, so we cannot get the index of a character");
		}
		try {
		String number = "34343dsfs";
		int num = Integer.parseInt(number);//Number Format Exception
		System.out.println(num);
		}catch (Exception e) {
			System.out.println("You cannot convert letters into an integer");
		}
		
		try {
		String[] arr = new String[2];//Index 0 - 1
		String data = arr[3];//Array Out Of Bounds Exception
		System.out.println(data);
		}catch (Exception e) {
			System.out.println("Index out of bounds");
		}
		System.out.println("This is the end of the program");
		
	}
}