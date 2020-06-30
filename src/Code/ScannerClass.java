package Code;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of integers");
         int N = in.nextInt();

       
        System.out.println("Enter the integers");
        int numbers[] = new int[N];
        for(int i = 0; i < N; i++)
        {
            numbers[i] = in.nextInt();
        }


         int smallest = numbers[0];
        for(int i = 0; i<N; i++){
            if(numbers[i]<smallest){
                smallest= numbers[i];
            }
        }
      System.out.println("Minimum Number"+smallest);
        
        
	}

}
