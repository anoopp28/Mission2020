package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class MapVsTable {

	public static void main(String[] args) {
		
		
    Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		
		h1.put(1,"Anoop");
		h1.put(1, "Selenium");
		h1.put(3, "Selenium");
		h1.put(4, "Selenium");
		h1.put(5,"Anoop");
		//h1.put(null, "Anoop");   //no null values
	
		for(Entry<Integer, String> forref: h1.entrySet()) {
			System.out.println(forref.getKey()+" = "+forref.getValue());
		}
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "kohli");
		hm.put(2, "Kumar");
		hm.put(3, "QA");
		hm.put(1, "virat");
		hm.put(3, "QA");
		hm.put(2, "Anoop");
		hm.put(null, "Anoop");

		
		for(Entry<Integer, String> newref : hm.entrySet()) {
			System.out.println(newref.getKey()+" = "+newref.getValue());
		}
		
	}

}
