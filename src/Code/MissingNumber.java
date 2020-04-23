package Code;

public class MissingNumber {

	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,13,14,15,16};
		int sum =0;
		int sum1 =0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		
        System.out.println(sum);

		for(int i=1; i<=a.length+1; i++) {
			sum1 = sum1 + i;
		}
		 System.out.println(sum1);
		 
		System.out.println("Missing number is " +(sum1-sum));
        
	}

}
