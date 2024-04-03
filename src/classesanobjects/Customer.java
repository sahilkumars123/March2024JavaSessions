package classesanobjects;

public class Customer {
	
	//class level /instance var
	String name = "sahil";
	int age;
	
	
	//data members of a class
	//variables
	//methods/functions of the class - used to write business logic
	
	
	
	// but method can be called from another method.
//	public void add() {
//		System.out.println("Add");
//		System.out.println(name);
//		sub();
//		
//	}
	
	public void sub() {
		System.out.println("Sub");
		System.out.println(name);
	}
	
	//methods written in a call is independent to each other
	
	
	
	//types of methods in a calls
	
	//1. no return and no input
	//void cannot written anything - no return keyword
	public void test() { //0 paramter
		
		System.out.println("test methods");
		//local variables
		int i = 10;
		System.out.println(i);
	}
	
	// 2. some return and no input:
	
	public int sum() {
		int a = 10;
		int b = 20;
		
		int c = a+b;
		//System.out.println(c); //30
		
		return c;
	}
	
	/*
	 * This method is returning the trainer name
	 * */
	public String getTrainerName() {
		
		System.out.println("getting the trainer for you !!!");
		String name = "abc";
		
		return name;
	}
	
	// 3. some return and some input:
	
	public int add(int a, int b) {
		
		int z = a+b;
		return z;
		
	}
	
	public int multiply(int a, int b) {
		System.out.println("multiplying two numbers");
		int mul = a * b;
		return mul;
		

	}
	
	
	

//	public static void main(String[] args) {
//		
//		// can not create a method inside a method.
////		void add() {
////			
////		}
//		
//		
//		Customer cus = new Customer();
//		cus.add();
//		
//		//cus.test();
//		
//	}

}
