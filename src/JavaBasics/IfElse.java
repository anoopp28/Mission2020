package JavaBasics;

public class IfElse {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		int c = 300;
		
		//if else ladder
		if((a>b)&(a>c)) {
			System.out.println("a is the greatest");
		}
		else if(b>c) {
			System.out.println("b is the greatest");
		}
		else {
			System.out.println("c is the greatest");
		}
		
		// nested if-else
		if(a>b){
			if(a>c)
			{
				System.out.println("a is the greatest");
			}
			else
			{
				System.out.println("c is the greatest");
			}
		}
		else {
			if(b>c) {
				System.out.println("b is the greatest");
			}
			else {
				System.out.println("c is the greatest");
			}
		}
			

	}

}
