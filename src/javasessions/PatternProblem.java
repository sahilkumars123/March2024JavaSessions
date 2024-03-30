package javasessions;

public class PatternProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		* * *
//		* * *
//		* * *
//		
//		//number of rows
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		//i=0, 1, 2
//		//j=0, 1, 2 
//		
//		//*
//		//*
//		//*
//		//*
		
		
//		*  [1, *]
//		* * [2, * *]
//		* * *
		
//		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//*
		//* *
		//* * *
		//i=1, 2, 3
		//j=1, 2, 3
		
//		* * *
//		* *
//		*
		
		
		
//		*****  [0, 5, 0]
//		 ***   [1, 3, 1]
//		  *    [2, 1, 2]
		
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=0; j<2*3-(2*i+1); j++) {
//				System.out.print("*");
//			}
//			
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		
//		  *    [2,1,2]
//		 ***   [1,3,1]
//		*****  [0,5,0]
//		*****  [0,5,0]
//		 ***   [1,3,1]
//		  *    [2,1,2]
//		
//		int n=3;
//		for(int i=0; i<n; i++) {
//			for(int j=0; j< n-i-1; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=0; j<2*i+1; j++) {
//				System.out.print("*");
//			}
//			
//			
//			for(int j=0; j< n-i-1; j++) {
//				System.out.print(" ");
//			}
//			
//			System.out.println("");
//		}
//		
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=0; j<2*n-(2*i+1); j++) {
//				System.out.print("*");
//			}
//			
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//		
//		int n=3;
//		
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n-i-1; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
		
//		  *    
//		  **
//		  ***  
//		  **
//		  * 

		
//		int n = 5;
//		int stars = 0;
//		
//		for(int i=1; i<2*n-1; i++) {
//			stars = i;
//			if(i>n) {
//				stars =  2*n-i;
//			}
//			for(int j=1; j<=stars; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
		
		
//		1
//		01
//		101
		
//		int start = 1;
//		int n = 5;
//		for(int i=1; i<=n; i++) {
//				if(i % 2 == 0) {
//					start = 0;
//				}
//				else {
//					start = 1;
//				}
//				for(int j=1; j<=i; j++) {
//					System.out.print(start+" ");
//					start  = 1 - start;
//			}
//				System.out.println();
//		}
//		
		
//		1    1  [1, 4, 1]
//		12  21  [12, 2, 21]
//		123321  [123321]
//		
//		int n=3;
//		
//		int space = 2*(n-1);
//		
//		for(int i=1; i<=3; i++) {
//			
//			//numbers
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			
//			//spaces
//			for(int j=1; j<=space; j++) {
//				System.out.print(" ");
//			}
//			
//			//numbers
//			for(int j=i; j>=1; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//			space = space - 2; 
//		}
		
		
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
	
//		for(int i=0; i<5; i++) {
//			//1st and last row
//			if(i == 0 || i ==4) {
//				for(int j=0; j<5; j++) {
//					System.out.print("*");
//				}
		
//			}
//			else {
//			//remaining rows
//			System.out.print("*");
//			for(int j=0; j<3; j++) {
//				System.out.print(" ");
//			}
//			System.out.print("*");
//		}
//			System.out.println();
//	}
		
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//		int n = 6;
//		for(int i=0; i<n; i++) {
//			for(int j=n; j>i; j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
//		int n=5;
//		
//		for(int row=0; row<n; row++) {
//			for(int col=0; col<row+1; col++) {
//				System.out.print(col+1);
//			}
//			System.out.println();
//		}
		
		
//		int n=5;
//		
//		for(int row=0; row<n; row=row+1) {
//			for(int col=0; col<n-row; col = col+1) {
//				System.out.print(col+1+" ");
//			}
//			System.out.println();
//		}
		
		
		//full pyramid
//		int n=7;
//		
//		for(int row=0; row<n; row=row+1) {
//			//number of spaces
//			for(int col=0; col<n-row-1; col=col+1) {
//				System.out.print(" ");
//			}
//			
//			//number of stars
//			for(int col=0;col<row+1;col=col+1) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
//	int n=6;
//		
//		for(int row=0; row<n; row=row+1) {
//			
//			//number of spaces
//			for(int col=0;col<row;col=col+1) {
//				System.out.print(" ");
//			}
//			
//			//number of stars
//			for(int col=0; col<n-row; col=col+1) {
//				System.out.print("* ");
//			}
//			
//		
//			System.out.println();
//		}
		
		
//		int n=5;
//		
//		
//		for(int row=0; row<n; row=row+1) {
//			//number of spaces
//			for(int col = 0; col<n-row-1; col+=1) {
//				System.out.print(" ");
//			}
//			
//			for(int col = 0; col<2*row+1; col+=1) {
//				if(col == 0 || col == 2*row) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		
//		for(int row=0; row<n; row=row+1) {
//			//number of spaces
//			for(int col = 0; col<row; col+=1) {
//				System.out.print(" ");
//			}
//			
//			for(int col = 0; col<(2*n - 2*row-1); col+=1) {
//				if(col == 0 || col == (2*n-2*row-2)) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		int n=5;
		for(int row=0; row<n; row+=1) {
			//stars
			for(int col=0; col<n-row; col=col+1) {
					System.out.print("*");
			}
			//spaces
			for(int col=0; col<2*row+1; col=col+1) {
				System.out.print(" ");
			}
			//stars
			for(int col=0; col<n-row; col=col+1) {
				System.out.print("*");
			}
			System.out.println();
		}	
	
	for(int row=0; row<n; row+=1) {
		//stars
		for(int col=0; col<row+1; col=col+1) {
				System.out.print("*");
		}
		//spaces
		for(int col=0; col<2*n-2*row-1; col=col+1) {
			System.out.print(" ");
		}
		//stars
		for(int col=0; col<row+1; col=col+1) {
			System.out.print("*");
		}
		System.out.println();
	}	
}

}
