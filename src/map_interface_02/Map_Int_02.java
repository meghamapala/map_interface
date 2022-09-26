package map_interface_02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Map_Int_02 {
	
	@Test
	
	public void map_int_Second() {
		
		String s = "united states of america";
		char[] c=s.toCharArray();
		HashMap<Character, Integer> hp=new HashMap<>();
		for (Character x: c) {
			if(hp.containsKey(x)) {
				hp.put(x, hp.get(x)+1);
				}else {
					hp.put(x, 1);
				}
		}
		Iterator<Entry<Character, Integer>>i=hp.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Character, Integer> e=i.next();
			System.out.println(e.hashCode());
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
	}

}
