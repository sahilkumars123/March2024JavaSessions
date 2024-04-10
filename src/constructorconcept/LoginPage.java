package constructorconcept;

public class LoginPage {
	

	String username;
	String password;
	
	
	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public void doLogin() {
		System.out.println("logic to app");
		System.out.println("your username is:: "+username);
		System.out.println("your username is:: "+password);
	}
	
	public void forgotPassword() {
		System.out.println("reset password link has been sent to your email !!!");
	}
	
	

}
