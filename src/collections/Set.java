package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		
		
		 int count[] = { 23, 45, 12, 28, 04, 95};
		   
		  HashSet<Integer> setobj = new HashSet<Integer>();
		   
		   for(int i=0; i<count.length; i++) {
			   setobj.add(count[i]);
		   }
		   
		   System.out.println(setobj);
		   
		   //Treeset by default gives sorted by passing set in its object
		   
		   TreeSet<Integer> sort = new TreeSet<Integer>(setobj);
		   System.out.println(sort);
		   System.out.println(sort.first());
		   System.out.println(sort.last());

	}

}
