package JavaBasics;

public class LocalVsGlobal {
    //global variables
	String name = "Anoop"; 
	int age = 25;
	
	public static void main(String[] args) {
	
		int i = 10;  // local variable to main method
		
		LocalVsGlobal obj = new LocalVsGlobal();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(i);
		
		obj.sum();
		
	}

	public void sum() {
		int i = 15;   // local variable to sum method
		int j = 20;
		System.out.println(i);
		System.out.println(j);
	}
}
