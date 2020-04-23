package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static <E> void main(String[] args) {
	
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		
		System.out.println(ar.size());
		
		ar.add(30);
		ar.add("test");
		ar.add('A');
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(2)); //To print a value
		
		// To print all the values
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
			
	    // Generic 
		ArrayList<Integer> ar1 = new ArrayList<Integer>();   //Integer I capital wrapper --> Generics in JAVA
		ar1.add(100);
		
	    ArrayList<E> ar2 = new ArrayList<E>();	 //Not sure about datatype then pass E
		
		
		//Storing the employee objects in arraylist
		
		Employee e1 = new Employee("Anoop", 25, "QA");
		Employee e2 = new Employee("Anoop", 25, "DEV");
		Employee e3 = new Employee("Anoop", 25, "Automation");	
		
		ArrayList<Employee> ar3 = new ArrayList<Employee>();
		
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		
		Iterator<Employee> it = ar3.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
		}
		System.out.println("**************************");
		System.out.println("To ADD");
		//To addAll
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Anoop");
		ar4.add("QA1");
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Anoop");
		ar5.add("Automation");
		ar5.add("QA2");
		
		ar4.addAll(ar5);
		
		for(int i=0; i<ar4.size(); i++) {
			System.out.println(ar4.get(i));
		}
		
		System.out.println("**************************");
		System.out.println("TO Remove");
		
		//To removeAll
		
		ar4.removeAll(ar5);
		
		for(int i=0; i<ar4.size(); i++) {
			System.out.println(ar4.get(i));
		}
		
		System.out.println("**************************");
     	System.out.println("TO Retain");
		
		//To retainAll
     	
     	ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Anoop");
		ar7.add("QA1");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Anoop");
		ar8.add("Automation");
		ar8.add("QA2");
		
		
		ar7.retainAll(ar8);
		for(int i=0; i<ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}
		
		
		
		
			
		}
		
}