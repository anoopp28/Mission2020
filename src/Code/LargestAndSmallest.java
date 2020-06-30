package Code;

public class LargestAndSmallest {

	public static void main(String[] args) {
		
		int numbers[] = { 400,-10, 24, 50 , -88 , 200 , 355, -89 , -87};
		int len = numbers.length;
	
		int largest = numbers[0];
		int smallest = numbers[0];
		
		
		for(int i=1; i<len; i++ ) {
			
			if(numbers[i] > largest) {
				largest = numbers[i]; 
				} 
				else if(numbers[i] < smallest) {
					smallest = numbers[i]; 	
				}
		}
		System.out.println("largest number is "+largest);
		System.out.println("smallest number is "+smallest);
	}
}
