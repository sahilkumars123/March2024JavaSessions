package methodcallingconcept;

public class Employee {

	int age;
	
	static String schoolName = "Shivalik Pulic School";
	
	//non static method
	public void m1() {

		System.out.println("m1");
		m2();
	}

	public void m2() {

		System.out.println("m2");
		m3();
	}

	public void m3() {

		System.out.println("m3");
	}

	//static methods
	public static void t1() {
		
		System.out.println("t1");
		t2();

	}

	public static void t2() {
		
		System.out.println("t2");
		t3();

		
		Employee emp1 = new Employee();
		emp1.m2();

	}

	public static void t3() {
		
		System.out.println("t3");

	}

	public static void main(String[] args) {

		Employee e = new Employee();
		

		//how to access non static vars: using Object ref name
		e.m1();
		e.age = 20;
		
		//how to access static vars and functions::
		//1. By Class name
		System.out.println(Employee.schoolName);
		
		Employee.schoolName = "YPS";
		
		//2. to access directly
		schoolName = "WPS";
		
		//3. to call by obj ref name
		e.schoolName = "NPS";
		
		System.out.println(schoolName);
		
		
		//static methods
		//1. using class name
		Employee.t1();
		//2. direct calling - in same class
		t2();
		//3. by object ref name4
		e.t3();
	
		
		
		

	}

}
