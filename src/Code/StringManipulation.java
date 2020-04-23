package Code;

public class StringManipulation {

	public static void main(String[] args) {
	
		String Str = "Monsoon is here!!!";
		String S = "Monsoon is Here!!!";
		
		
		System.out.println(Str.length());
		
		System.out.println(Str.charAt(16));
		
		System.out.println(Str.indexOf('n'));   //1st Occurrence
		
		System.out.println(Str.indexOf('n', Str.indexOf('n')+1)); //2nd Occurrence
		
		System.out.println(Str.indexOf("is"));
		
		System.out.println(Str.indexOf("Hello"));    //if the string is not available then it returns -1
		
		System.out.println(Str.equals(S));      //Java is case sensitive
		
		System.out.println(Str.equalsIgnoreCase(S));
		
		System.out.println(Str.substring(3, 10));   //Substring
		
		
		String a  = "        Anoop       kumar        ";
		System.out.println(a.trim());   // trim is only to trim before and after spaces 
		
		//Replace
		String date  = "12-12-2012";
		System.out.println(date.replace('-', '/'));
		
		//Split
		String sent = "Hello_world_Test_Selenium";
		String afterSplit[] = sent.split("_");
		for(int i=0; i<afterSplit.length; i++)
		System.out.println(afterSplit[i]);
		
		//String + Integer = StringInteger
		String x = "Hello";
		String y = "World";
		int u = 100;
		int v = 200;
		
		System.out.println(u+v);
		System.out.println(x+y+u+v);
		System.out.println(u+v+x+y);
		System.out.println(x+y+(u+v) );
	}

}
