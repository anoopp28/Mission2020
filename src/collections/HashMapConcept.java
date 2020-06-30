package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Anoop");
		hm.put(2, "Kumar");
		hm.put(3, "QA");
		hm.put(1, "Anoop");
		hm.put(2, "Anoop");

		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		for(Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue() );
		}
		
		System.out.println(hm);
		hm.remove(2);
		System.out.println(hm);
		
		//HashMap for employee class
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Anoop",25,"QA");
		Employee e2 = new Employee("Kumar",25,"QA");
		
		emp.put(1, e1);
		emp.put(2, e2);
		 
		System.out.println("******************************");
		
		for(Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println(key+" Info");
			System.out.println(e.name+" "+e.age+""+" "+e.dept);
		}
		
		}
	}


