package javasessions;

public class LoopsConcept {

	// for loop
	// while loop
	// do while loop

	public static void main(String[] args) {
		
		


		// 1. while loop
		// syntax of while loop
		// pratical purpose

//		int i = 1;
//		
//		while(i <=100) {
//			System.out.println(i); //1 
//			//i = i+1;
//			//i++;
//			//++i;
//		}	

		System.out.println("----------------------------");

//		int l = 1;
//		
//		while(l <=100 ) {
//			if(l == 5) {
//				System.out.println("Hi");
//				break;
//			}
//			System.out.println("Bye"); // Bye Bye Bye Bye Hi
//			l++;
//		}

		// under 2 conditions - switch case statement, or in loops

		// if case ? NO
		// else if ? NO

//		int a = 10;
//		
//		if(a> 5) {
//			System.out.println("corrent marks");
//			break;
//		}

		System.out.println("--------------------------");

//		while(true) {
//			System.out.println("Welcome to Taj Hotel ---Its open 24 X 7 !!!");
//			break;
//		}

		int count = 0;

		while (count <= 100) {
			System.out.println(count); // 0123...25 25 runs
			if (count == 25) {
				System.out.println("25 runs");
			}
			if (count == 50) {
				System.out.println("half century");
			}
			if (count == 100) {
				System.out.println("century");
			}

			count++;
		}

		// use cases of while loop

		// where we need to use the while loops
		// - where the iterations are not fixed

		// wait for the page loading: 0, 5, 10, 20
		// wait for the element on the page: 0, 2, 5, 10, 20\
		// drop down values:
		// webtable pagination:
		// calendar:
		// carousel:

		// when we are sure about the iterations - for loop

		// for -loops

		// 1 to 10

//		for(int i = 1; i<=10; i++) {
//			System.out.println(i); //1 2 3 4 ...10
//		}

//		int p=1;
//		for(;p<10;) {
//			System.out.println(p); //11
//			p++;
//		}

		System.out.println("---------------------------");

//		for(int m=1; m<=100; m++) {
//			System.out.println(m); //1 3 5 7 9
//			m++; 
//		}

//		for(int m=1; m<=10; m=m+2) {
//			System.out.println(m); //1 3 5 7 9
//		}

//		for(;;) {
//			System.out.println("Hello");
//		}

		for (int run = 1; run <= 10; run++) {
			for (int j = 1; j <=10; j++) {
				System.out.println(j); // 1
			}
		}

		//run = 1
		//j = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		
		//run = 2
		////j = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		
		
		//// use cases for loop:
		// use for loop when number of iterations are fixed
		// array int a[10]
		// mohths - 12
		// days - 7

	}

}
