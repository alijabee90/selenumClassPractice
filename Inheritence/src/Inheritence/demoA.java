package Inheritence;

import java.security.PKCS12Attribute;

public class demoA {

	public static void main(String[] args) {
		A a1 = new A();
		a1.number =20;
		a1.word ="Hello";
		System.out.println(a1.number +" " + a1.word);
		
		B b1 = new B();
		b1.number = 30;
		b1.word ="World";
		b1.run();
		b1.mixedNumber = 5.5;
		b1.test();
		System.out.println( b1.number + " " + b1.word + " " + b1.mixedNumber);
		
		
		C c1 = new C();
		
		c1.number = 40;
		c1.word  = "Java";
		c1.run();
		c1.mixedNumber = 6.6;
		c1.test();
		c1.value = true;
		c1.execute();
		
		System.out.println(c1.number + " " + c1.word + " " + c1.mixedNumber + " " +c1.value);
		
		
		
		

	}

}
