package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestCollections {

	public static void main(String[] args) {
	
		HashMap<String, String> hashobj = new HashMap<String, String>();
		
        hashobj.put("Anoop", "Kumar");
        hashobj.put("Virat", "Kohli");
        hashobj.put("KL", "Rahul");
        hashobj.put("Hardik", "Pandya");
        hashobj.put("Nirup", "Kumar");
        
        //All values in the form of set
         System.out.println(hashobj.entrySet());
         //All values in the form of maps
         System.out.println(hashobj);
         
        
         for(Map.Entry<String, String> forref : hashobj.entrySet()) {
        	 System.out.println("Key - "+forref.getKey()+" Value - "+forref.getValue());
         }
        
         for(Entry<String, String> newref : hashobj.entrySet()) {
        	 System.out.println(newref);
         }
         
         //Only keys
         for(String newref : hashobj.keySet()) {
        	 System.out.println(newref);
         }
         
         //Converting maps to arraylist
         ArrayList<String> arraylist = new ArrayList<String>( hashobj.keySet());
         System.out.println("Maps to Arraylist - "+arraylist);
         
         //Iterating using Iterator
        Set<Entry<String, String>> set = hashobj.entrySet();
        System.out.println(set);
        
     
        java.util.Iterator<Entry<String, String>> it = set.iterator(); 
        while(it.hasNext()) {
            System.out.println(it.next() + " "); 
        
	}
        
        
   
	}
}
