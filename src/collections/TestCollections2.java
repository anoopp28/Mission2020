package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;



public class TestCollections2 {

	public static void main(String[] args) {
	
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		arraylist.add(30);
	
		
		System.out.println(arraylist);
		
		for(Integer forref: arraylist) {
			System.out.println(forref);
		}
		
		
       ArrayList<String> arrayliststr = new ArrayList<String>();
		
		arrayliststr.add("Anoop ");
		arrayliststr.add("Virat");
		arrayliststr.add("Rahul");
		arrayliststr.add("Hardik");
		

		
		System.out.println(arrayliststr);
		
		for(String S : arrayliststr) {
			System.out.println(S);
		}
		
		
		java.util.Iterator<String> it = arrayliststr.iterator();
		while (((java.util.Iterator<String>) it).hasNext()) {
			System.out.println(it.next());
		}
		

	      List<StudentClass> ref = new ArrayList<StudentClass>();
			
	      ref.add(new StudentClass(1, "Anoop"));	
	      ref.add(new StudentClass(2, "Virat"));	
	      ref.add(new StudentClass(3, "Rahul"));
	      
		
	      HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	      
	      for(StudentClass forref: ref) {
	    	  hashmap.put(forref.getId(), forref.getName());
	      }
	      
	   System.out.println(hashmap);   
	   
	
	   
	   for(Map.Entry<Integer, String> refmap : hashmap.entrySet()) {
		   System.out.println("Key is "+refmap.getKey()+ " Value is "+refmap.getValue());  
	   }
	 
	   
	   
	   HashMap<Integer,StudentClass> stu = new  HashMap<Integer,StudentClass>();
	   
	   stu.put(1, new StudentClass(16,"Anoop"));
	   stu.put(2, new StudentClass(18,"Virat"));

	   
	  
	   for(Map.Entry<Integer, StudentClass> newref :stu.entrySet()) {
		   int key = newref.getKey();
		   StudentClass Sc = newref.getValue();
		   System.out.println(key);
		   System.out.println(Sc.id +" "+Sc.name);
	   }
	   
	}

}
