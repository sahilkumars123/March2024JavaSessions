package staticconcept;

import java.util.Arrays;

public class Car {
	
	String name;
	String engineNumber;
	String chasisNumber;
	double price;

	
	final static int wheels = 4;
	
	public final void test() {
		System.out.println("test");
	}
	
	public final void test(int a) {
		System.out.println("test");
	}

	public static void main(String[] args) {
		
	//	NOTE:: overloading of static methods is possible;
		
		
		Car c1 = new Car();
		
		c1.name  = "Audi A4";
		
		c1.test();
		c1.test(10);
		
		
		System.out.println(Car.wheels);
		

		
		
		
		
		

	}

}
