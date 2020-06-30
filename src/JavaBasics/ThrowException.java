package JavaBasics;

public class ThrowException {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		
		try {
		throw new Exception("Anoop Exception");    //it will call Exception constructor with string parameter
		} 
		catch(Exception e){
			e.printStackTrace();
		}
		
 
		System.out.println("Start");
		
		String Exec_flag = " 1 ";
		if(Exec_flag.equals(" ")) {
			try {
			throw new Exception("Exec_flag is null exception");
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
			else {
				System.out.println("Test123");
	}
		System.out.println("Test");   // After handling exception
	}

}
