package ArrayList;


import java.util.ArrayList;

public class taskList {

	public static void main(String[] args) {
		ArrayList<String> employees = new ArrayList<String>();
		employees.add ("Sarah");
		employees.add("Jason");
		employees.add ("kevin");
		employees.add ("Tyson");
		employees.add ("Alex");
		employees.add ("Omar");
		employees.add ("Patrick");
		System.out.println(employees);
		employees.add ("Thomas");
		employees.add(0,"Micheal");
        employees.remove(2);
        employees.remove("Omar");
        employees.add(5,"Erin");
        System.out.println(employees);
	}

}
