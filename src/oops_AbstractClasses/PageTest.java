package oops_AbstractClasses;

public class PageTest {

	public static void main(String[] args) {
		
		//we cant create an object of an abstract class
		
		LoginPage lp = new LoginPage();
		
		lp.title();
		lp.url();
		lp.defaultTimeout();
		lp.doLogin();
		lp.age = 30;
		
		//Page.displayFooters();
		LoginPage.displayFooters();
		
		lp.displayLogo();
		
		System.out.println("----------------------");
		
		Page p1 = new LoginPage();
		
		p1.title();
		p1.url();
		p1.defaultTimeout();
		//p1.doLogin ///reference check has been failed
		
		Page.displayFooters();
		
		p1.displayLogo();
		
		
		

	}

}
