package JavaBasics;

public class MainMethod {

	public static void main(String[] args) {    //array parameter
		// TODO Auto-generated method stub

		System.out.println("main method 1");
		
		for(String s : args) {
			System.out.println("Values"+s);
		}
		
		main("Anoop");
		main(10);
		main(10,20);
	}
	public static void main(String args) {     //String parameter
		// TODO Auto-generated method stub
		System.out.println("main method 2");
	}
	
	public static void main(int a) {
		// TODO Auto-generated method stub
		System.out.println("main method 3");
	}
	
	public static void main(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("main method 4");
	}
	

}
