package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {

//		ChromeBrowser driver = new ChromeBrowser();
//		
//		driver.findElement("login button");
//		driver.click();
//		driver.sendKeys();
//		driver.quit();
//		
//		
//		FireFoxBrowser driver1 = new FireFoxBrowser();
//		
//		driver1.findElement("login button");
//		driver1.click();
//		driver1.sendKeys();
//		driver1.quit();

		String browserName = "sahil";
		WebDriver driver = null;

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
		    driver = new ChromeBrowser();
			break;
			
		case "firefox":
			driver = new FireFoxBrowser();
			break;
			
		case "safari":
			driver = new SafariBrowser();
			break;

		default:
			System.out.println("please pass the right browser name:: "+browserName);
		}
		
		driver.findElement("login button");
		driver.click();
		driver.sendKeys();
		driver.quit();

	}

}
