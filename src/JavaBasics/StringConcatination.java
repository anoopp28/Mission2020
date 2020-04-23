package JavaBasics;

public class StringConcatination {

	public static void main(String[] args) {
		
		// + is concatination operator
		
		int a = 100;
		int b = 200;
		
		double c = 12.33;
		double d = 20.33;
		
		String x = "Hello";
		String y = "world";
		
		System.out.println(a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println((a+b)+x+y);
		System.out.println(x+a+y+b);
		System.out.println(c+d);
		System.out.println(c+d+x+y);
		System.out.println(x+y+c+d);

	}

}
