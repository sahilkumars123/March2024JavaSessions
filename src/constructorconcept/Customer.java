package constructorconcept;

public class Customer {
	
	String name;
	int custId;
	String city;
	long phoneNumber;
	
	
	public Customer(String name, int custId, String city, long phoneNumber) {
		this.name = name;
		this.custId = custId;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}
	
	//but - where to write business logic ?
	
	public int getSalary(int totalCTC, int bonus) {
		return totalCTC + bonus;
	}
	
}
