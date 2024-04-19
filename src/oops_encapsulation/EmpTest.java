package oops_encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		
		
		emp1.setName("sahil");
		System.out.println(emp1.getName());
		
		emp1.setAge(30);
		System.out.println(emp1.getAge());
		
		emp1.setSalary(20000.00);
		System.out.println(emp1.getSalary());
		
		System.out.println(emp1.getAmount(300)); //310
		
		System.out.println("---------------------------------");
		
		
		Employee emp2 = new Employee();
		
		emp2.setName("ravi");
		System.out.println(emp2.getName());
		
		emp2.setAge(25);
		System.out.println(emp2.getAge());
		
		emp2.setSalary(30000.00);
		System.out.println(emp2.getSalary());
		
		System.out.println(emp2.getAmount(30)); //40
		
		
		System.out.println("---------------------------------");
		
		Employee emp3 = new Employee();
		
		
		
		System.out.println(emp3.getName()); //null
		
		
		System.out.println(emp3.getAge());  //0
		
		
		System.out.println(emp3.getSalary()); //0.0
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
