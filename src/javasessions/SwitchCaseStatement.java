package javasessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		//usecase :: where you will get multiple values and you have choose out of them
		// dev, qa, stage, pre-prod, prod
		
//		String browser = "chrome";
//		
//		double version = 111.11;
		
		// switch - case: int, short, byte, string, char
		
		//String is allowed 
//		
//		switch (browser) {
//		case "chrome":
//			System.out.println("launch chrome");
//				if(version == 111.11) {
//					System.out.println("launch chrome 111.11 version ");
//				}
//				else {
//					System.out.println("invalid version");
//				}
//			break;
//		case "firefox":
//			System.out.println("launch firefox");
//			break;
//		case "edge":
//			System.out.println("launch edge");
//			break;
//		case "opera":
//			System.out.println("launch opeara");
//			break;
//		default:
//			System.out.println("please pass the right browser name:: "+browser);
//		}
//		System.out.println("I am out of switch case statement");
//	}
	
		
		//int is allowed
//	int marks = 95;
//	switch (marks) {
//	case 10:
//		System.out.println("grade D");
//		break;
//	case 90:
//		System.out.println("grade A");
//		break;
//	case 95:
//		System.out.println("grade A+");
//		break;
//
//	default:
//		System.out.println("FAIL");
//		break;
//	}
		
		
		//double value is not allowed
		//long value is not allowed
		
//	
//		long  l =  4567L;
//		switch (l) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}	
		
		
		//char is allowed 
		char c = 'a';
		switch (c) {
		case 'a':
			break;
		
		}
	
		short s = 12;
		switch (s) {
		case 10:

			break;

		default:
			break;
		}
	
	}
}
