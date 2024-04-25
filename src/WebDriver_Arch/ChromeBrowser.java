package WebDriver_Arch;

public class ChromeBrowser implements WebDriver {

	public ChromeBrowser() {
		System.out.println("lanched chrome browser");
	}

	@Override
	public void click() {
		System.out.println("click on an element");
	}

	@Override
	public void sendKeys() {
		System.out.println("sendkeys on an element");
	}

	@Override
	public void quit() {
		System.out.println("quit that browser");

	}

	@Override
	public void findElement(String element) {
		System.out.println("finding that element:: " + element);
	}
}
