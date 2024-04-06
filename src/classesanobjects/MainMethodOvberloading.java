package classesanobjects;

public class MainMethodOvberloading {
	
	
	//is it possible overload main method - YES
	
	
	public static void main(String[] args) {
		
		System.out.println("test");

	}

	public static void main(int a) {
		System.out.println("test1");

	}
	
	public static void main(String name) {
		
		System.out.println("test2");

	}

}
