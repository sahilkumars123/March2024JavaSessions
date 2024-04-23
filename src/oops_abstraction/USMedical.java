package oops_abstraction;

public interface USMedical extends WHO {
	
	//abstraction - we are hiding the functionality, and in the child class we are implementing it
	//encapsulation - we hide the data(private members data) , exposed them public layer
	
	//abstract methods - 100% abstraction ------ 0-100% abstarction
	
	int medicalfee = 10; //by default variables declared in interface are static and final in nature.
	
	
	// method has no body
	// only method declaration/method prototype
	// no buss logic
	// abstract methods
	
	//can we have abstract method as final in nature ? - A BIG NO to it
	//can we have abstract method as static in nature ? - NOT ALLOWED
	
	public void physioServices();

	public void cardioServices();

	public void ENTServices();
	
	public void emergencyServices();
	
	//method overloading is possible incase of interfaces
	public void test();
	
	public void test(int a);
	
	@Override
	public void covidVaccination();
	
	// JDK 1.8:
	//default methods can be overridden
	default void billing() {
		System.out.println("US -- medical billing");
	}
	
	public static void USMedPharmacy(int a) {
		System.out.println("US -- Med Pharmacy");
	}

}
