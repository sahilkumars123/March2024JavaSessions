package classesanobjects;


//Runner class
public class CustomerRunner {

	public static void main(String[] args) {
		
		Customer cus = new Customer();
		
		//cus.add();
		cus.sub();
		//System.out.println(cus.sub()); //syntax error
		
	String name = cus.getTrainerName();
	
	
	//validation
	if(name.equals("abc")) {
		System.out.println("this is the correct trainer name");
	}
	else {
		System.out.println("this is the incorrect trainer name");
	}

	System.out.println(name);  //abc
	
//	int  c = cus.sum();
//	
//	System.out.println(c);
	
	int d = cus.add(10,  20);
	
	System.out.println(d + 20);
	
	int mul = cus.multiply(10, 20);
	
	System.out.println(mul);
	
	}

}
