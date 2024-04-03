package javasessions;

public class ArrayConcept {
	
	//Array is static in nature - fixed size
	//can store only similar type of data. int, float, String, char
	
	public static void main(String[] args) {
		
		//1. int array
		int[] arr = new int[4];
		
		//li = 0
		//length = 4
		//hi = length-1 = 3
		//range = [0 to 3]
		
		
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;
		arr[3] = 20;
	//	arr[-1] = 10; //AIOB
	//	arr[4] = 20; //AIOB
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		
		//2. double array
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 34.44;
		
		
		System.out.println(d); //address
		System.out.println(d[0]);//value
		
		//3. char array:
		char c[] = new char[3];
		c[0] = 'a'; //97
		c[1] = 'A'; //65
		c[2] = '0'; //48
		
		System.out.println((int)'9');
		
		//String array
		
//		String[] browsers = new String[4];
//		browsers[0] = "chrome";
//		browsers[1] = "firefox";
//		browsers[2] = "safari";
//		browsers[3] = "edge";
//		
//		System.out.println(browsers[0]);
//		System.out.println(browsers[2]);
//		System.out.println(browsers[3]);
		
		
		// Array Literals
		
		String[] browsers = {"chrome", "safari", "edge", "firefox"};
		
		System.out.println(browsers[0]);
		System.out.println(browsers[2]);
		System.out.println(browsers[3]);
		
		

	}

}
