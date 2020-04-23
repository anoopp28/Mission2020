package JavaBasics;

public class StaticNonStatic {

	String name = "Anoop"; 
	static int age = 25;   //static
	
	
	public static void main(String[] args) {
		
		// direct calling
		sum();
		// calling by classname
		StaticNonStatic.sum();
  
		System.out.println(age);
		System.out.println(StaticNonStatic.age);
		
	}
	
	public void sendmail() {
		System.out.println("send mail");	
	}
	
	public static void sum() {
		System.out.println("sum");	
	}

}
