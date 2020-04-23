package JavaBasics;

public class FinalConcept {

	public static void main(String[] args) {


	final int i = 10;
	System.out.println(i);
	
	test();

	}
	
	public static void test() {
		try {
			System.out.println("inside test1");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("inside catch");
		}
		finally {
			System.out.println("inside finally");
		}
	}
}
