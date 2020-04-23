package JavaBasics;

public class Loops {

	public static void main(String[] args) {
     
	 // While
		int n=1;
	 while(n<=10) {
		 System.out.println(n);
		 n++;
	 }
	 
	 // for
     for(int i=0; i<=5; i++) {
    	 int j;
    	 
    	 for(j=1; j<=i; j++) {
    		 
    		 System.out.print("*");
    	 }
    	 
    	  System.out.println("*");
    	  
     }
     
     for(int i=6; i>=0; i--) {
    	 int j;
    	 
    	 for(j=1; j<=i; j++) {
		 
    		 System.out.print("*");
   	 }
   	 
   	   if(i==0) { 
   		   
   		 System.out.println("*");
   		 break;
   	   }
            System.out.println("*");
    }
    
	}

}
