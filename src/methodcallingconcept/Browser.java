package methodcallingconcept;

public class Browser {

	// to a non-static method - you have to create an object
	public void b1() {

		Employee emp = new Employee();
		emp.m1();

	}

	public void b2() {

		Employee.t2();
	}
	
	public static void b3() {
		Employee.t3();
	}


	public static void main(String[] args) {

		Browser browser = new Browser();
		browser.b1();

	}

}
