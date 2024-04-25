package oops_AbstractClasses;

public class LoginPage extends Page {

	//Java creats one hidden default const
	public LoginPage() {
		System.out.println("Login Page default const");
	}
	
	public LoginPage(int a) {
		System.out.println("Login Page param const");
	}
	
	
	@Override
	public void title() {
		System.out.println("LoginPage ----title");
		
	}

	@Override
	public void url() {
		System.out.println("LoginPage ----URL");	
	}
	
	@Override
	public void defaultTimeout() {
		System.out.println("LoginPage---- 5 secs");
	}
	
	
	public void doLogin() {
		System.out.println("LoginPage --- individual Login method");
	}
	
	

}
