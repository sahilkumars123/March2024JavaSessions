package oops_inheritence;

public class BMW extends Car {

	// method overriding: Polymorphism (RunTime/dynamic)
	// when we have a method in parent class and the same method in child class
	// with:
	// the same name
	// the same number of parameters
	// the same sequence/order of the parameters
	// the same return type
	
	@Override
	public void start() {
		System.out.println("BMW --- start");
	}

	public void autoparking() {
		System.out.println("BMW-- autoparking");
	}
}
