package Code;

public class Palendrome {

	public static void main(String[] args) {
		
		
		
		String s = "Hello World";
		String rev = "";
		//There is no reverse in string class - String is immutable
		
		int len = s.length();
		
		for(int i = len-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
          System.out.println(rev);
          
         
          
          
          
          // Using String buffer class
          StringBuffer sf = new StringBuffer(s);
          System.out.println(sf.reverse());
          
          
          //Reverse Integer 
          int i = 12340;
          int r = 0;
        
          while(i!=0) {
        	  r = r * 10 + i % 10;
        	  i = i/10;
          }
          
          System.out.println(r);
          
          
          //Using String buffer
          int j = 123450;
          String s1 = String.valueOf(j);
          
          StringBuffer sf1 = new StringBuffer(s1);
          System.out.println(sf1.reverse());
          
          
          //Using String buffer
          
          long num = 1234567890;
          
          System.out.println(new StringBuffer(String.valueOf(num)).reverse());
          
	
	}

}
