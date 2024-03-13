package javasessions;

public class DataTypesConcept {

	public static void main(String[] args) {
		
//		x = 10;
//		print(x);
		
		
		//java is strict datatype language
		int x = 10;
		
		
		//primitive datatype : that will take some space in the memory
		//no need to create any object
		
		//Numeric
				//a. Integer - byte, short, int, long
				//b. Float - float, double
		
		//char: char
		
		//Non-numeric
			//Boolean : true or false
			
		//non-primitive dataype : Class, String, Interface etc
		
		
		//Integer family
		
		// byte
		//size: 1byte = 8 bits
		//range = -128 to 127
		
		byte a = 20;
		byte b = 124;
		//b = 20;
		System.out.println(b);
		
		//byte c = a+b;
		System.out.println(a+b);
		
		//short
		//2 bytes : 16 bits 
		//-32768 to 32767
		
		short x1 = 32767;
		
		//3. int
		//4 bytes = 32 bits
		//range: -2147483648 to 2147483647
		
		int l = 100000;
		
		
		//4. long 
		//size : 8 bytes = 8*8 = 64 bits
		
		long l3 = 9876;
		long l4 = 9876778283L;
		
		System.out.println(l4);
		
		//aadhar card number //phone number//credit card number
		
		
		//float :
		//4bytes = 4*8 = 32 bits
		//range : after . can store upto 6 to 7 digits
		
		float b2 = 3.4f;
		float b3 = (float)3.4; 
		
	
		//double value 
		// 8*8 = 64 bits
		//range: after . can take upto 15 digits

		double d = 45.67;
		
		
		float buildVersion = 1.5f;
		
		
		//char 
		//2 bytes = 16 bits
		//unicode : ASCII + special uni code chars (symbolic, chinese, japanese)
		//range:
				//a-z: 97 to 122
				//A-Z: 65 to 90      
				//0-9: 48 to 57
		
		
		
	char gh = 'a'; //97
	char hj = 'b'; //98
	
	
	char fg = '9'; //49
 	
	System.out.println(gh);
	
	System.out.println(gh + hj); //97+98 = 195
	
	System.out.println(gh+""+hj); 	//ab //string concatenation
	
	System.out.println((byte)'$'); //36
	
	System.out.println((byte)' '); //32
	
	
		//Boolean
		//size: ~1 bit  = true, false
	
	boolean flag = true;
	
	
	//naming convention
	
	//int billingAmount = 5678;
	//int total_billing_amount = 1000;
		

	}

}
