package JavaBasics;

public class Functions {

	public static void main(String[] args) {  
		
		// main method is static method
		
		Functions obj = new Functions();   //obj is entity to call all non static methods, copy of all non static methods will be given to object once it i created.
		
		// Object cannot hold static methods
		
		obj.test();
		System.out.println(obj.qa());
		System.out.println(obj.pqr());
		System.out.println(obj.division(20,10));
	
	}
		
		public void test() {
			System.out.println("test method");
		}
		
		public int pqr() {
			System.out.println("pqr method");
			
			int a = 10;
			int b = 20;
			int c = a+b;
			
			return c;
			}

		public String qa() {
			System.out.println("QA method");
			String s = "Selenium";
			return s;
		}
		
		

		public int division(int x, int y) {
			System.out.println("div method");
			int d = x/y;
			return d;
			}

}
