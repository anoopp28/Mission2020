package Code;

public class SwapIntegers {

	public static void main(String[] args) {
	
		int x = 20;
		int y = 5;
		
//		int z;
//		
//		z = x;
//		x = y;
//		y = z;
//		
//		
//		System.out.println(x);
//		System.out.println(y);
		
		
		//Without 3rd Var
		
//		x = x+y;
//		y = x-y;
//		x = x-y;
//		
//		System.out.println(x);
//		System.out.println(y);
		
		
//		x = x*y;
//		y = x/y;
//		x = x/y;
//		
//		System.out.println(x);
//		System.out.println(y);
		
		//Using XOR ^
		
		x = x^y;
		y = x^y;
		x = x^y;

		System.out.println(x);
		System.out.println(y);
	}

}
