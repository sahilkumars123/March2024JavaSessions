package javasessions;

public class Testing {

	// WAF:
	// launch a browser --> chrome//ff//safari//edge
	// statement: browser is launched
	// return: true/false -- boolean
	// launchBrowser(browserName (string))

	public boolean launchBrowser(String browserName) {

		//System.out.println(browserName);
		
		boolean flag = true;

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("browser is launched");
			break;
		case "firefox":
			System.out.println("browser is launched");
			break;

		case "safari":
			System.out.println("browser is launched");
			break;
		case "edge":
			System.out.println("browser is launched");
			break;

		default:
			System.out.println("please pass the correct browser name:: "+browserName);
			flag = false;	
		}
		
		return flag;

	}
	
	
	// with multiple returns:
		public boolean launchBrowerTest(String browserName) {
			System.out.println("launching the browser..." + browserName);

			switch (browserName.trim().toLowerCase()) {
			case "chrome":
				System.out.println("launch chrome -- PASS");
				return true;
			case "edge":
				System.out.println("launch edge");
				return true;
			case "safari":
				System.out.println("launch safari -- pass");
				return true;
			case "firefox":
				System.out.println("launch firefox -- Pass");
				return true;

			default:
				System.out.println("plz pass the right browser..." + browserName);
				return false;
			}
		}

	public static void main(String[] args) {

		Testing t = new Testing();

		if(t.launchBrowerTest("sahil")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}

	}

}
