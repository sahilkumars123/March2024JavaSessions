package constructorconcept;

public class Employee {
	
	String name; //null
	int age; //0
	String city; //null
	
	
	//properties of a constructor
	//1. constructor name should be same as of class name
	//2.  can not return anything/no void
	//3. //how to call a constructor - create a object and it will automatically called
	//4. can pass parameters to the const...const overloading? yes its possible
	public Employee() { //0 arg constructor -- default const
		System.out.println("default const");
	}
	
	
	public Employee(int a) { //1 arg constructor
		System.out.println(a);
	}
	
	public Employee(int a, String name) { //2 arg constructor
		System.out.println(a);
		System.out.println(name);
	}
	
	public Employee(String name, int a) { //2 arg constructor
		System.out.println(a);
		System.out.println(name);
	}
	
	
//Purpose of constructor
  //1. to restrict the creation of the objects
  //2. 
	
	
	

	public static void main(String[] args) {
		
		
		
		Employee emp = new Employee();
		
		
		System.out.println(emp.name);
		
		Employee emp1 = new Employee(10);
		
		
		
		
		
		
		
		
		
		
		//object creation
		// first problem statement
//		Employee emp1 = new Employee();
//		emp1.name = "sahil";
//		emp1.age = 29;
//		emp1.city = "Bglr";
//		
//		
//		Employee emp2 = new Employee();
//		emp2.name = "ravi";
//		emp2.age = 26;
//		emp2.city = "hyd";
//		
//		
//		Employee emp3 = new Employee();
//		emp3.name = "rithika";
//		emp3.age = 25;
//		emp3.city = "chennai";
//		
//		
//		//2. to restrict the creation of the objects
//		Employee emp4 = new Employee(); 
//		Employee emp5 = new Employee(); 
//		Employee emp6 = new Employee(); 
//		Employee emp7 = new Employee(); 
		
		

	}

}