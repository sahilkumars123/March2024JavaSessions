package methodcallingconcept;

public class CallByValue {
	
	
//	//call by value
//	public void add(int a , int b) {
//		a = 30;
//		int c = a+b;
//		
//		System.out.println(c);  //50
//		
//	}
	
	
	
	//call  by refernce
	public void show(int[] arr) {
	
	arr[0] = 80;
		
		
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]); //80 20 30 40 50
	}
	
	
		
	}
	
	
	

	public static void main(String[] args) {
		
//		int a = 10;
//		int b = 20;
//		
		Employee e = new Employee();
//		e.add(a, b);
//		
//		int sum = a+b; //30
//		
//		System.out.println(sum);
		
		
		//array liertals
		int[] arr = {10,20, 30, 40, 50};
		
		e.show(arr);
		
		System.out.println("-----------------");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]); //10 20 30 40 50
		}
		
		

	}

}
