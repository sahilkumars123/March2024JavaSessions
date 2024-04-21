package oops_inheritence;

public class Car extends Vehicle {

	public void start() {
		System.out.println("Car --- start");
	}

	public void stop() {
		System.out.println("Car --- stop");
	}

	public void refeul() {
		System.out.println("Car --- refuel");
	}
	
	public static void testing() {
		System.out.println("Car----testing");
	}
	
	public final void power() {
		System.out.println("power ---- Car");
	}
	
	
	public  static void ABS() {
		System.out.println("ABS ---- Car");
	}
	
	private void carTesting() {
		System.out.println("Car --- testing");
	}
	
	public void CarPublicTesting() {
		carTesting();
		System.out.println("this is car testing method");
	}
	
	
	// final:
		// 1. constant values
		// 2. to prevent the method overridding -- infront of methods
		// 3. to prevent inheritance -- -- infront of class name

}
