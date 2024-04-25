package BuilderPattern;

public class Shopping {
	
	
	
	public Shopping login() {
		System.out.println("user is logged in");
		return this; 
	}
	
	public Shopping search(String productName) {
		System.out.println("search product:: "+productName);
		return this; 
		
	}
	
	public Shopping addToCart() {
		
		System.out.println("product has been added to the cart");
		return this;
		
	}
	
	public Shopping doPayemnt() {
		
		System.out.println("doing a payment");
		return this;

		
	}
	
	public Shopping generateOrder() {
		
		System.out.println("generating the order");
		return this;

		
	}
	
	public void logout() {
		
		System.out.println("logout from the application");

		
	}

}
