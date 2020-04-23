package JavaBasics;

public class Array {

	public static void main(String[] args) {
		//array to store similar data type values in array variable
		//multiple values in single array
		// size is fixed - static array - to overcome we use collections
		//stores only similar data types - to overcome we use object array
		
		int n;
		int i[] = new int[10];
		
		//Length of array
		System.out.println(i.length);
		
		// To store all the values
		for( n=0; n<i.length; n++) {
			i[n] = n;
		}
		
		// To print all the values
		for( n=0; n<i.length; n++) {
			System.out.println(i[n]);	
		}
		
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		
		
	// Double array
		
		double d[] = new double[3];
		d[0]=12.33;
		d[1]=34.55;
		d[2]=45.66;
		
		System.out.println(d.length);
		
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[0]);
		
		
	//Char
		char c[] = new char[3];
		c[0]= 'A';
		c[1]= '2';
		System.out.println(c[0]);
		System.out.println(c[1]);
		
	//Boolean
		boolean b[] = new boolean[3];
		b[0]= true;
		b[1]= false;
		
		
	// String
		String s[] = new String[3];
		s[0]= "Anoop";
		s[1]= "Kumar";
		s[1]= "1";
		
		System.out.println(s.length);
		System.out.println(s[2]);
		System.out.println(s[1]);
		
		
		
		
	// Object array
		Object ob[] = new Object[5];
		ob[0]= "Anoop";
		ob[1]= '2';
		ob[2]= "28/4/1995";
		ob[3]= 'M';
		ob[4]= "bangalore";
		System.out.println(ob[2]);
		
		for(n=0; n<ob.length; n++) {
			System.out.println(ob[n]);
		}
	}

}