package Code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElement {


	public static void main(String[] args) {
		
	  String names[] = {"Java", "Python", "C", "Java","Javascript","C","Java"};
	  
	  //Compare each element
	  for(int i=0; i<names.length; i++) {
		  
		 for(int j=i+1; j<names.length; j++) {
			 if(names[i]==names[j]) {
				 System.out.println("Duplicate is "+names[i]); 
				 break;
			 }
			 
		 }
		 
	  }
	  System.out.println("________________________________");  
	 
	  //Using Hashset
	  
	  Set<String> store = new HashSet<String>();
      
	  for(String name: names) {
		  if(store.add(name)==false) {
			  System.out.println("Duplicate is "+name);  
		  }
	  }  
	 
	  System.out.println("________________________________");  
		 
	  //Using HashMap
	  
	  Map<String, Integer> store1 = new HashMap<String, Integer>();
	  
	  for(String name: names) {
		 Integer count = store1.get(name);    //this will try to get first string ie java but store1 object is empty now so it will return null
		 if(count == null) {
			store1.put(name, 1); 
		 }
		 else {
			 store1.put(name, ++count);
			 System.out.println("Duplicate is "+name);  
		 }
			
			
			}
	  }
	  

}
