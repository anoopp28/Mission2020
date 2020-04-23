package JavaBasics;

public class Class {
	
	String mod;
    int wheel;
    

	public static void main(String[] args) {
	
		// new Class(); is object
		//a is obj ref var
		
		Class a = new Class();
		Class b = new Class();
		Class c = new Class();
		
		a.mod = "BMW";
		a.wheel = 4;
		
		b.mod = "Audi";
		b.wheel = 4;

		c.mod = "Jaguar";
		c.wheel = 4;
		
		System.out.println("Before changing reference");
		
		System.out.println(a.mod);
		System.out.println(c.wheel);
		
		System.out.println("After changing reference");
		
		a = b;
		b = c;
		c = a;
		
		System.out.println(a.mod);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		System.out.println(b.wheel);
	}

}
