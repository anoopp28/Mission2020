package JavaBasics;

public class ExceptionHandlingConcept {

	int a =10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//		//Uncaught exception
//		int i = 9/0;
//		System.out.println(i);   // ArithmaticException
//		
//		//caught exception
//		//Thread.sleep(2000);
//		
//		
//		ExceptionHandlingConcept obj = new ExceptionHandlingConcept();
//		obj = null;
//		System.out.println(obj.a);    //NullPointerexception
//		
		//1. Try catch block
		try {
			int j = 9/0;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();  //method used to display the exception in console
		System.out.println(e.getMessage());
		
		}
		System.out.println("ABC");
		
	}

}
