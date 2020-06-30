package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		
		h1.put(1,"Anoop");
		h1.put(2, "Selenium");
		h1.put(3, "Selenium");
		h1.put(4, "Selenium");
		h1.put(5,"Anoop");
		
		
		// To create clone copy
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		
		h2 =(Hashtable<Integer, String>)h1.clone();
		
		System.out.println(h1);
		System.out.println(h2);
		
		h1.clear();
		
		System.out.println(h1);
		System.out.println(h2);
		
		
		//Contains value
		
		if(h2.containsValue("Selenium")) {
			System.out.println("Found");
			
		}
		
		
		//To print all the values - enumeration
		
      Enumeration<String> e =h2.elements();
      System.out.println("Print values ");
      
      while(e.hasMoreElements()) {
    	  System.out.println(e.nextElement());
      }
      
    //To print all the values - Entry set
      
      Set<Entry<Integer, String>> s =h2.entrySet();
      System.out.println(s);
    
    //Check both the hashtables are equal
      
      Hashtable<Integer, String> h3 = new Hashtable<Integer, String>();
		
      h3.put(1,"Anoop");
      h3.put(2, "Selenium");
      h3.put(3, "Selenium");
      h3.put(4, "Selenium");
      
      System.out.println(h3);
      
      if(h2.equals(h3)) {
    	  System.out.println("Both are equal");
      }
		
		
      //to get the value from key
      
      System.out.println(h3.get(3));
      
      //to get the hashcode of hashtable object
      
      System.out.println("the hashcode value of h3"+h3.hashCode());

	}

}
