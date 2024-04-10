package methodcallingconcept;

public class User {
	
	int a = 10;
	
	public void sendEmail() {
		a = 20;
		System.out.println("Sending email");
	}
	
	
	//call  by reference
	public static void getEmail(User u1) {
//		User u2 = new User();
//		u2.sendEmail();
		
		
		u1.sendEmail();
		
		System.out.println("getting email");
		
		
		
		
	}
	
	public static void readingEmail(User u3) {
		
//		User u2 = new User();
//		u2.sendEmail();
		
		u3.sendEmail();
		
		System.out.println("reading email");
	}

	public static void main(String[] args) {
		
		User u1 = new User(); //one object
		
		
		User.getEmail(u1);
		
		System.out.println("------------");
		
		User.readingEmail(u1);

	}

}
