package Code;

public class Palindrome {

	
	public static void isPalindrome(int num) {
	
		int rev = 0;
		int sum = 0;
		int t;
		
		t = num;
		
		while(num>0) {
			rev = num%10;
			sum = (sum*10)+rev;
			num = num/10;
		}
		
		if(t==sum) {
			System.out.println("No is Palindrome");
		}
		else
			System.out.println("No is not Palindrome");
	}
	
	public static void isPalindromeString(String S) {
	int len = S.length();
	String rev = "";
	
	for(int i = len-1; i>=0; i--) {
		rev = rev+S.charAt(i);
	}
	
	if(S.equals(rev)) {
		System.out.println("String is Palindrome");
	}
	else
		System.out.println("String is not Palindrome");
     
	}
	
	
	
	
	public static void main(String[] args) {
		
		isPalindrome(1542641);

		isPalindromeString("a");
	}

}
