package Code;

public class FactorialNumber {

	//Without recursion
	
	public static int factorial(int num) {
		int fact = 1;
		for(int i = num; i>=1; i--) {
			fact = fact *i;
		}
		System.out.println(fact);
		return fact;
		
	}
	
	
	//With Recursive function - function that calling itself
	
	public static int fact(int num) {
		if(num==0 || num == -1)
			return 1;
		return (num * fact(num-1));
	}
	
	public static void main(String[] args) {
	
		//factorial(6);
		System.out.println(fact(5));

	}

}
