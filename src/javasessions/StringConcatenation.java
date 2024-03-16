package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		//String is a class in java //predefined
		
		//" "
		
		String s = "hello world";
		
		System.out.println(s);
		
//		int a = 10;
//		int b = 20;
		
		//int c = a+b;
		
	//	System.out.println(c);
		
		
		System.out.println(10+20); //30
		
		String s1 = "100";
		System.out.println(s1 + 20); //120 //10020
		
		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "Selenium";
		
		System.out.println(a + b); //300
		System.out.println(x + y); //Hello Selenium
		
		System.out.println(a + b + x + y); //300HelloSelenium
		
		System.out.println(x + y + a + b);  //HelloSelenium100200

		System.out.println(x + y + (a + b));  //HelloSelenium300
		
		System.out.println(a + b + x + y + a + b); //300HelloSelenium100200
		
		System.out.println("the value of a is:: "+a); //the value of a is:: 100
		
		System.out.println("the value of a is:: "+ a+b);  //the value of a is:: 100200
		
		double c = 12.33;
		double d = 12.44;
		
		System.out.println(c + d); //24.77
		System.out.println(x + y + c + d);  //HelloSelenium12.3312.44
		System.out.println(a + b + x + y + c + d); //300HelloSelenium12.3312.44
		
		char c1 = 'a'; //97
		char c2=  'b'; //98
		
		
		System.out.println(c1); //a
		System.out.println(c1+c2); //97+98 = 195
		System.out.println(x + y + c1 + c2); //HelloSeleniumab
		System.out.println(c1+ c2 + x + y);   //195HelloSelenium
		
		System.out.println(a + b);
		System.out.println(a - b); //-100
		System.out.println(b / a);  //2
		System.out.println(b % a); //200 % 100 = 0  % operator will give you the remainder
		
		System.out.println(c2-c1); //1
		System.out.println(c1*c2); //9506

		
		//boolean = true false
		
		System.out.println("the value is:: "+true);
		System.out.println("the value is:: "+false);
		
		System.out.println(9/3); //3
		System.out.println(9/2); //4 
		
		System.out.println(9.0/2); //(float/int) = (float/float) = (9.0/2.0) = 4.5
		
		System.out.println(9/2.0); //(int/float) = (float/float) = (9.0/2.0) = 4.5
		
		System.out.println(9.0/2.0); //4.5
		
		
		//int numbers
		
		System.out.println(0/1); //0
		
	//	System.out.println(1/0); //AE

		System.out.println(0/100);
		
		//System.out.println(9/0); //AE
		
		
		//for floating point numbers
		
		System.out.println(0.0/9.0); // 0.0
		
		System.out.println(9.1/0); //(9.1/0.0)  //Infinity
		
		System.out.println(9.0/0); //Infinity
		
		System.out.println(9.0/0.0); //Infinity
		
		
		
		System.out.println(0.0/0.0);  //NaN
		
		System.out.println(0/0.0);  //NaN
		
		System.out.println(0.0/0);  //NaN
		
		
		//System.out.println(0/0); //Exception case //AE
		
		//System.out.println('a' / 0); //97/0 //AE
		
		System.out.println (0/'a'); //0/97 //0
		
		//interview question
		
		// byte = 1byte = 8 bits = -128 to 127
		
		//byte, short, int , long
		
		
		byte f1 = 30;
		byte f2 = 20;
		int f3 = f1+f2;
		
		//-32768 to 32767
		
		short t1 = 30000;
		short t2 = 30000;
		int t3 = t1+t2; //60000
		
		
		//range: -2147483648 to 2147483647
		int d1= 200;
		int d2 = 300;
		int d3 = d1+d2;
		
		//binary number = 0,1
		//decimal number = 0,1,2,3,4,5,6,7,8,9
		//octal numbers = 0,1,2,3,4,5,6,7
	
		
		int h = 065;
		System.out.println(h); //53
		
		
		int u = 0765676543;
		System.out.println(u);

	}

}
