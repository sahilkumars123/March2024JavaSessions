package oops_encapsulation;

public class LoginPageTest {

	public static void main(String[] args) {
		
		LoginPage lp1 = new LoginPage();
		lp1.setUsername("sahil994");
		lp1.setPassword("12345");
		
		
		lp1.doLogin();
		
//		String username = lp1.getUsername();
//		String password = lp1.getPassword();
//		
		
//		if(username.equals("sahil994")) {
//			System.out.println("TC PASS");
//		}
//		else {
//			System.out.println("TC FAIL");
//		}
		
		
		LoginPage lp2 = new LoginPage();
		lp2.setUsername("ravi996");
		lp2.setPassword("1234567890");
		
		lp2.doLogin();


	}

}
