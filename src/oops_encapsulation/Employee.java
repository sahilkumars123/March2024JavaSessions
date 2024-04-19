package oops_encapsulation;

public class Employee {

	// private vars
	private String name; // sahil
	private int age;
	private double salary;
	private int amount;  //310 , 40
	
	
	private void calculateAmount(int fees) { //300
		int i = 10;
		//int fees = 20;
		amount = i + fees; //310
	}
	
	
	public int getAmount(int fees) {
		calculateAmount(fees);
		return amount;
		
	}

	
	// public getters/setters method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String getName() {
//		return name;
//	}

}
