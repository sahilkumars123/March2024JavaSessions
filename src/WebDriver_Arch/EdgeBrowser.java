package WebDriver_Arch;

public class EdgeBrowser implements WebDriver {

	@Override
	public void click() {
		System.out.println("click on an element -- SF");
	}

	@Override
	public void sendKeys() {
		System.out.println("sendkeys on an element -- SF");
	}

	@Override
	public void quit() {
		System.out.println("quit that browser -- SF");
		
	}

	@Override
	public void findElement(String element) {
		System.out.println("finding that element -- SF:: "+element);
	}
}
