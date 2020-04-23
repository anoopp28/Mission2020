package JavaBasics;

public class MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		MethodOverload obj = new MethodOverload();
		
		obj.sum();
		obj.sum(2);
		obj.sum(10, 20);
	}
	
	public void sum() {
		System.out.println("Sum method - no argu");
	}
	public void sum(int i) {
		System.out.println("Sum method - 1 argu");
		System.out.println(i);
	}
	public void sum(int i, int j) {
		System.out.println("Sum method - 2 argu");
		System.out.println(i+j);
	}
	public void sum(double i, double j) {
		System.out.println("Sum method - 2 argu");
		System.out.println(i+j);
		
	}
	
	public int sum(int i, int j) {
		System.out.println("Sum method - 2 argu");
		System.out.println(i+j);
	}

}
