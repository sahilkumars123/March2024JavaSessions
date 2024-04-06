package classesanobjects;

public class Employee {
	
	//Class - Template, Blueprint or Category
	
	//class/instance level vars
	String name;
	int age;
	double salary;
	int a = 10;
	
	
	final int calenderMonths = 12;
	final int totalDaysInAWeek = 7;
	
	
	public final void  test() {
		
		//local variables
		int a =20;
		
		System.out.println(a); //20
	}
	
	 
	
	public void showTest() {
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		
		emp.calenderMonths = 10;
		
		emp.totalDaysInAWeek = 6;
		
		
		System.out.println(emp.a); 
		
		//Employee - class name
		//emp - obj ref name
		// new - is keyword to create an object
		//new Employee() ---> Object type
		
		Employee emp1 = new Employee();
		
		Employee emp2 = new Employee();
		
		
		emp.name = "sahil";
		emp.age = 24;
		emp.salary = 35000.89;
		
		
		emp1.name = "ravi";
		emp1.age = 25;
		emp1.salary = 45000.00;
		
		//access
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.salary);
	}

}
