package classesanobjects;

import java.util.Arrays;

public class Person {

	// method overloading //compile time polymorphism
	// within the same class if you have multiple methods:
	// 1. with the same method name
	// 2. with the different parameters
	// 3. with the different types of parameters
	// 4. with the different sequence/order of the parameters
	// 5. return type does not matter

	// area
//	- circle  
//	- square
//	- rectangle 
//	- right angle triangle

	// - calculateArea

	// 1. we need to have different args/parameter
	// 2 difference in the arg type

	// 1 arg method
//	public void calculateArea(int radius) {
//
//	}

	// 2 arg method
	public int calculateArea(int length, float breadth) {

		return 100;

	}

	public void calculateArea(float length, float breadth) {

	}

	public void calculateArea(int length) {

	}

	public void calculateArea() {

	}

	public void sortProducts(String featureProducts) {

	}

	public void sortProducts(int price) {

	}
	
	
	
	
	public void doPayment(String upi) {
		
	}
	

	public void doPayment(int c) {
		
	}

	public static void main(String[] args) {

		Person p = new Person();

		p.calculateArea(10.7f, 20.4f);

		// real time usecases of method overloading

	}

}
