package collections;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <String> ll = new LinkedList<String>();
		
		ll.add("Anoop");
		ll.add("Selenium");
		ll.add("Mission");
		
		System.out.println(ll);
		
		
	//AddFirst
		ll.addFirst("Java");
	//AddLast
		ll.addLast("Python");
		
		System.out.println(ll);
		
	//To get
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(4));
	//To set
		ll.set(1, "Jon");
		System.out.println(ll);
		
	//RemoveFirst
		ll.removeFirst();
	//RemoveLast
		ll.removeLast();
		
		ll.remove(2);
		
		System.out.println(ll);
		
		//Using for
		for(int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		//Advanced LOOP
		for(String str : ll) {
			System.out.println(str);
		}
		
		
		
	}

}
