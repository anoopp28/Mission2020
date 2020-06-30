package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
	
	public static void main(String[] args) {
	
	ArrayList<Integer> arry = new ArrayList<Integer>();
	
	arry.add(10);
	arry.add(9);
	arry.add(8);
	arry.add(7);
	arry.add(6);
	arry.add(5);
	
	System.out.println(arry);
	
	Iterator<Integer> it = arry.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	for(int i=0; i<arry.size(); i++) {
		System.out.println(arry.get(i));
	}
	
	System.out.println(arry.size());
	
	for(int i=arry.size()-1; i>=0; i--) {
		System.out.println(arry.get(i));
	}
  }

}
