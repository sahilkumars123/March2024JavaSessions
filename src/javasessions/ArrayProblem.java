package javasessions;

public class ArrayProblem {

	public static void main(String[] args) {

		
		int[] arr = new int[2];
		
		arr[0] = 10;
		arr[1] = 20;

		inc(arr, arr.length);

		//print
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static void inc(int[] brr, int length) {
		
		brr[0] += 10;
		brr[1] = 30;
		
		//print
		for(int i=0; i<brr.length; i++) {
			System.out.println(brr[i]);
		}	
	}

}
