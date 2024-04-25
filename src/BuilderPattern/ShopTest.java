package BuilderPattern;

public class ShopTest {

	public static void main(String[] args) {
		
		Shopping shop = new Shopping();
		
//		shop.login();
//		shop.search("tshirt");
//		shop.addToCart();
//		shop.doPayemnt();
//		shop.generateOrder();
//		shop.logout();
		
		shop.login()
			.search("tshirt")
				.addToCart()
					.doPayemnt()
						.generateOrder()
							.logout();
		
		

	}

}
