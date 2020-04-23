package Code;

public class PrimeNum {
	
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumbers(int num) {
		for(int i=2; i<=num;i++) {
			if(isPrime(i))                
				System.out.print(i+ " ");    //This line will print only the if the above method returns true to above line
		}
	}

	public static void main(String[] args) {
		
	getPrimeNumbers(77);
		
	}

}
