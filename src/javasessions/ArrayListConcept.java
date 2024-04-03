package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {

		
		//dynamic in nature - 4 ele - 6mon
		
		//ArrayList exist a existing class in Java
		//dynamic array
		//it has some pre-defined existing methods as well
		//add
		//get
		//remove
		//size
		
		
		//Collections class
		//Arraylist literals - Arrays.asList
		
		
		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add(30); //pc = 3, vc=7
		
		//a.remove(2);
		//a.remove((Object)30);
		
		System.out.println(a);
		
		
		System.out.println(a.size()); //3
		
		
		a.add(40);
		a.add(50);
		a.add(60);
		
		System.out.println(a.size()); //6
		
		a.add("Sahil");
		a.add(456.678);
		
		System.out.println(a.size()); //8
		
		a.add(50);
		
		System.out.println(a.size()); //9
		System.out.println(a); //entire arraylist
		
		//getting a single number
		System.out.println(a.get(3));
		
		//System.out.println(a.get(-1)); //IOB Exception
		//System.out.println(a.get(9));
		
		
		//int - Integer
		//float - Float
		
		ArrayList<Integer> al = new ArrayList(5);
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al.size());
		//System.out.println(al.get(5));
		
		System.out.println("------------");
//		System.out.println(al); //10 20 30 40 50
//	    Collections.reverse(al);
//	    System.out.println(al); //50 40 30 20 10
		
//		for(int i= al.size()-1; i>=0; i--) {
//			System.out.println(al.get(i));// 4 3 2 1
//		}
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		ArrayList<Object> empDataList = new ArrayList<Object>(); //vc=10,pc=0
		empDataList.add("Manisha");
		empDataList.add(25);
		empDataList.add(34000.55);
		empDataList.add('f');
		empDataList.add(true);
		
		
		//ArrayList literals
		
		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome", "firefox", "edge"));
		
		System.out.println(browserList);
		
		System.out.println(browserList.size());
		
		for(String s : browserList) {
			
			System.out.println(s);			
			if(s.equals("edge")) {
				System.out.println("launch edge");
				break;
			}
			else {
				System.out.println("incorrect search");
			}	
		}
		
		
	}
	
	

}
