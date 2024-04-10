package constructorconcept;

public class Testing {
	
	
	private Testing() {
		System.out.println("Hello");
	}
	
	public static void show() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {

		Testing test = new Testing();
	}

}
