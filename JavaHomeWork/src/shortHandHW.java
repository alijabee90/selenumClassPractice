
public class shortHandHW {

	public static void main(String[] args) {
		int number = 5;
        System.out.println(number++); // prints 5, then increments number to 6
        System.out.println(--number); // decrements number to 5, then prints 5
      
        int number2 = -7;
        number2 += number; // sets number2 to -7 + 5 = -2
        System.out.println(number2++); // prints -2, then increments number2 to -1
       
        
        int number3 = 70;
        int number4 = 60;
        int number5 = 80;
        boolean comp = number3 < number4 || number4 > number5;
        System.out.println(comp);
        
        int a = 5;
        boolean res = ++a == 5 || --a == 5 && -- a == 5;
        System.out.println(res);
        
        
        
        		
        boolean z = true, w = true;
        int x = 20;
        z = (x != 10) || (w = false);
        System.out.println(z);
        
        
	}

}
