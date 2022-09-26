package arratlist_array;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Array_List {
	
	@Test
	public void array_vs_ArrayList() {
		
	/*	int a[] = {1,2,3,4,5,0,7,8,9};
		
		for(int number: a) {
			System.out.println(number);
		}
	
		String [] v= {"BMW,Benz,Toyota,Jeep,Audi"};
		for(int i =0; i<v.length; i++){
			System.out.println(v[i]);
		}
		*/
		int k1 []= {1,2,3,4,5,0,7,8,9};
		
		List<Integer> v=new ArrayList<Integer>();
		
		for (int number11: k1) { 
			v.add(number11);
		}
		System.out.println(v);
		
		}}


