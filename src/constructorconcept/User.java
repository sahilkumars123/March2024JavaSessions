package constructorconcept;

public class User {

	String name;
	int age;
	String city;
	double salary;
	char gender;
	boolean isActive;
	
	
	//PO - buisness logic -- AC
	//create a user
	
	//1. name and age
	//2. name and age and city
	//3. name and age, city, gender
	//4. all the fields
	
	
	//2. purpose to intialize the class level variables

//	public User(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//
//	public User(String name1, int age1, char gender1) {
//		
//
//	}
//
//	public User(String name, int age, String city, char gender) {
//
//	}
	
	
	

	public User(String name, int age, String city, double salary, char gender, boolean isActive) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
		this.gender = gender;
		this.isActive = isActive;
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		
		
		User u1 = new User("sahil", 29);
		
		
		System.out.println(u1.name); //sahil
		
		System.out.println(u1.age);
		
//		Employee emp1 = new Employee();
//		emp1.age = 20;
		
		//Testing test = new Testing();
		
		Testing.show();
		
		//System sys = new System();
		
		//Runtime
		

	}

}
