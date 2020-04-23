package JavaBasics;

public class WrapperClass {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);   // will return integer
		System.out.println(i+20);
		
		
		String y = "100.20";
		System.out.println(y+20);
		
	    double j = Double.parseDouble(y);
		System.out.println(j+20);
		
		
		
		String k = "true";
		Boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		
		int a = 200;
		System.out.println(a+20);
		
		String s = String.valueOf(a);
		System.out.println(s+20);
		
		
//		String u = "100A";
		
//		int c = Integer.parseInt(u); // to convert string to integer then string should be Pure numeric integer 
		
	}

}
