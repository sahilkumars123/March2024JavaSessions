package javasessions;

import java.util.Arrays;

public class ArrayTraversing {

	public static void main(String[] args) {

//		int[] k = new int[4];
//		
//		k[0] = 10;
//		k[1] = 20;
//		k[2] = 30;
//		k[3] = 40;
		
		
		//1.
		//System.out.println(Arrays.toString(k));
		
		//2. index based loop
//		for(int i=0; i<k.length; i++) {
//			System.out.println(k[i]);
//		}
		
		
//		for(int i=0; i<=k.length-1; i++) {
//			System.out.println(k[i]);
//		}
		
		//0 = 10
		//1 = 20
		//2 = 30
		//3 = 40
//		
//		for(int i=0; i<k.length; i++) {
//			System.out.println(k[i]);
//			if(k[i] == 30) {
//				System.out.println("hi");
//				break;
//			}
//		}
		
		
		//3. for-each loop or enhanced loop
		
//		for(int s : k) {
//			System.out.println(s);
//			if(s == 30) {
//				System.out.println("hi");
//				break;
//			}
//		}
		
		
		
//		short s[] = new short[5];
//		s[0] = 100;
//		s[1] = 200;
//		s[2] = 300;
//		s[3] = 400;
//		s[4] = 500;
//		
//		for(short t : s) {
//			System.out.println(t);
//		}
		
		
//		String[] browsers = new String[4];
//		browsers[0] = "chrome";
//		browsers[1] = "firefox";
//		browsers[2] = "safari";
//		browsers[3] = "edge";
//		
//		
//		for(String s : browsers) {
//			System.out.println(s);
//			if(s.equals("safari")) {
//				System.out.println("launch safari");
//				break;
//			}
//		}
		
		
		//Employee data: String, int, double , char, boolean
		//Object class
		//Object array
		
//		Object[] emp = new Object[5];
//		emp[0] = "Sahil";
//		emp[1] = 29;
//		emp[2] = 20000.00;
//		emp[3] = 'm';
//		emp[4] = true;
//		
//		for(Object e : emp) {
//			System.out.println(e);
//		}
		
		
   int[] k = new int[4];
		
		k[0] = 10;
		k[1] = 20;
		k[2] = 30;
		k[3] = 40;
		
		// 40 30 20 10
		//reverse for loop using index based loop
//		for(int i=k.length-1; i>=0; i--) {
//			System.out.println(k[i]);
//		}
		
		//HW:: 
		for(int s : k) {
			System.out.println(s);
		}
//		
		
	}

}
