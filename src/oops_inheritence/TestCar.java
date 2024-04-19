package oops_inheritence;

public class TestCar {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.stop();
		c.refeul();
		c.start(); //Car - start
	
		
		
		System.out.println("--------------------------");
	
		
		BMW b = new BMW();
		
		b.autoparking(); //individual method
		b.stop(); //inherited method
		b.refeul(); //inherited method
		b.start(); //BMW-- start //overridden method
		
		
		System.out.println("--------------------------");
		
		
		Audi ad = new Audi();
		
		ad.start();
		ad.stop();
		ad.refeul();
		
		
		ad.theftSafety();
		
		
		System.out.println("--------------------------");
		
		//topcasting/upcasting 
		Car c1 = new BMW();
		
	
		//child class overrridden method will be called
		c1.start(); // BMW start
		
		
		
		c1.stop(); //Car stop
		c1.refeul(); //Car refeul
		
		
		//parent cannot call child individual methods
		//c1.autoparking(); -- compile time error
		
		
		
		Vehicle vh = new BMW();
		
		vh.engine();	
		
		
		System.out.println("--------------------------");
		
		//Downcasting
		BMW b1 = (BMW) new Car();
		
		//Exception in thread "main" java.lang.ClassCastException: class oops_inheritence.Car cannot be cast to class oops_inheritence.BMW (oops_inheritence.Car and oops_inheritence.BMW are in unnamed module of loader 'app')
		//at oops_inheritence.TestCar.main(TestCar.java:61)
		
		b1.start();
		
	

		
		

	}

}
