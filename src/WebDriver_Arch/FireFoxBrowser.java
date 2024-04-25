package WebDriver_Arch;

public class FireFoxBrowser implements WebDriver {
	
	public FireFoxBrowser() {
		System.out.println("lanched firefox browser");
	}

	@Override
	public void click() {
		System.out.println("click on an element -- FF");
	}

	@Override
	public void sendKeys() {
		System.out.println("sendkeys on an element -- FF");
	}

	@Override
	public void quit() {
		System.out.println("quit that browser -- FF");
		
	}

	@Override
	public void findElement(String element) {
		System.out.println("finding that element -- FF:: "+element);
	}

}
