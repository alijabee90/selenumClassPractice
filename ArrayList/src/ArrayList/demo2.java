package ArrayList;
import java.util.ArrayList;

public class demo2 {

	public static void main(String[] args) {
	
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("David");
		arrlist.add("Harry");
		arrlist.add("Ajay");
		arrlist.add("David");
		arrlist.add(1, "Ajay");
		arrlist.remove("Harry");
		arrlist.remove(1);
		
		System.out.println(arrlist);
		

	}

}
