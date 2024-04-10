package constructorconcept;

public class LoginPageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage("sahil994", "12345");
		
		lp.doLogin();
		
		
		LoginPage lp2 = new LoginPage("ravi", "54321");
	}

}
