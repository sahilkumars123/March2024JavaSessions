package javasessions;

public class ConditionalOpeartorsConcept {

	public static void main(String[] args) {

		// ==  - primitive datatypes - int family, float, char
		//non-primitive - String, Classes
		
		System.out.println(10 == 20); //false
		
		int x =10;
		int y = 10;
		
		if(x == y) {
			System.out.println("x is equals to y");
		}
		else {
			System.out.println("x is not equals to y");
		}
		
		// > , < , >=, <=, !=
		
		if(x>=y) {
			System.out.println("x is eq to or grtr than y");
		}
		else {
			System.out.println("bye");
		}
		
		
		boolean flag = false;
		
		if(flag) {
			System.out.println("this statement is true");
		}
		else {
			System.out.println("this statement is false");
		}
		
		
		char c1 = 'a';
		char c2 = 'a';
		
		if(c1 == 97) {
			System.out.println("c1 and c2 are eq");
		}

		
		//nested if-else 
		
		int marks = 96;
		
		if(marks <= 100) {
			if(marks >= 90) {
				System.out.println("A Grade");
					if(marks >= 95) {
						System.out.println("You got a scholarship");
					}
					else {
						System.out.println("You are not eligible for scholarship");
					}
			}
			else {
				System.out.println("B Grade");
			}
			
		}
		else {
			System.out.println("please enter the corrent marks:: "+marks);
		}
		
		System.out.println("--------------------------------------");
		
		//multiple if - if - if - if
		
//		String browser = "sahil";
//		
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//		if(browser.equals("edge")) {
//			System.out.println("launch edge");
//		}
//		if(browser.equals("opera")) {
//			System.out.println("launch opera");
//		}
//		else {
//			System.out.println("please pass the right browser:: "+browser);
//		}
		
		//Disadavantages ::
	 
		
		//if - elseif
		
		String browser = "chrome";
		
		if(browser.equals("chrome")){
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		else if(browser.equals("edge")) {
			System.out.println("launch edge");
		}
		else if(browser.equals("opera")) {
			System.out.println("launch opera");
		}
		else {
			System.out.println("please pass the right browser name:: "+browser);
		}
	}
	

}
