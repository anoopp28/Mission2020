package JavaBasics;

public class CallBy {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		CallBy obj = new CallBy();
		int x = 10;
		int y = 20;
		obj.sum(x, y); // Call by Value
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj); // Call by reference
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
   
	
	public int sum(int a, int b) {
		 a = 30;
		 b = 40;
		int c = a+b;
		return c;
	}
	
	public void swap(CallBy t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		
	}
}
