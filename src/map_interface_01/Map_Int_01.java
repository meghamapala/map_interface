package map_interface_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Map_Int_01 {
	
	@Test
	public void hash_Map_01() {
		
		String s = "united states of america";
		char[] cd=s.toCharArray();
		HashMap<Character, Integer> hp=new HashMap<>();
		for (Character x: cd) {
			if(hp.containsKey(x)) {
				hp.put(x, hp.get(x)+1);
			}else {
				hp.put(x, 1);
			}
			}
		Iterator<Entry<Character, Integer>> e=hp.entrySet().iterator();
		while(e.hasNext()) {
		Entry<Character, Integer> i=e.next();
		System.out.println(i.hashCode());
		System.out.println(i.getValue());
		System.out.println(i.getKey());
		
	}}}

 
	 
	 
	



