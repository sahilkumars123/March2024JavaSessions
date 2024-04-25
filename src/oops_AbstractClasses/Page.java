package oops_AbstractClasses;

public abstract class Page {
	
	//it is not static , not even final
	int age = 20;
	
	//can we constructor in Abstarct class ----- YESSSSS !!!
	public Page() {
		this(10);
		System.out.println("page class default const");
	}
	
	public Page(int a) {
		System.out.println("page class param const");
	}
	
	
	//100% abstraction - i do have all the abstract methods
	//0% abstraction - i dont have any abstract methods
	//partial abstarction
	
	public abstract void title();
	
	public abstract void url();
	
	
	public void defaultTimeout() {
		System.out.println("Page---- 10 secs");
	}
	
	public static void displayFooters() {
		System.out.println("Page --- Footers");
	}
	
	public final void displayLogo() {
		System.out.println("Page --- logo");
	}

}
