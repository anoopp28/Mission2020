package Code;

public class SwapStrings {

	public static void main(String[] args) {
		
		String a = "Anoopkumar";
		String b = "BJDB";
		
		System.out.println(a);
		System.out.println(b);
		
		
		a = (a+b);
		System.out.println(a); 
		
		b = a.substring(0,a.length()-b.length());
		
		
		a = a.substring(b.length(),a.length());
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
