package classesanobjects;

public class Employee {
	
	//Class - Template, Blueprint or Category
	
	//class/instance level vars
	String name;
	int age;
	double salary;
	

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
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
