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

	@Override
	public void engine() {

		System.out.println("engine ----- BMW");
	}
	
	//static method can be inherited
	//static methods are not overridden
	
	public static void testing() {
		System.out.println("BMW----testing");
	}
	
	public final void power(int i) {
		System.out.println("power ---- Car");
	}
	
	private void carTesting() {
		System.out.println("Car --- testing");
	}


}
