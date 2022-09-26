package array_vs_arraylist;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Array_Vs_List {
	
	@Test
	public void methodArray_Vs_List() {
		
		int []a = {1,2,3,4,0,5,6,7,8,9};
		
		List<Integer> h=new ArrayList <>();
		
		for (int number: a) {
			h.add(number);
			System.out.println(number);
		}
		
	}

}
