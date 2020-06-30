package JavaBasics;

public class ThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException {

	ThrowsKeyword obj = new ThrowsKeyword();
	obj.sum();
	System.out.println("ABC");    //it will not print this line, coz exceptions are not handled so program terminated
	}
	
	public void sum() throws ArithmeticException {
		try {
		div();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void div() throws ArithmeticException{
		int i = 9/0;
	}
	
	

}
