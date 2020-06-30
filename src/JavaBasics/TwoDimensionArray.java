package JavaBasics;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		String s[][] = new String[3][5];
		
		System.out.println(s.length);  //no of rows
		System.out.println(s[2].length);  //no of columns
		
		s[0][0] = "Anoop";
		s[0][1] = "Kumar";
	
		System.out.println(s[0][1]);
	}

}
