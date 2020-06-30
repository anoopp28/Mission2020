package Code;

import java.util.Scanner;

public class DatabaseCleanup {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the no of Emp");
		  String n = in.nextLine();
		  System.out.println(n);
		  
		  int L = Integer.parseInt(n);
		  System.out.println(L);

			String  X[][]=new String[L][2];
			System.out.println("Enter the data");
			
			for(int i=0; i<L; i++){
				String input=in.nextLine();
				String[] tokens = input.split(" ");
				X[i][0]=tokens[0];
				X[i][1]=tokens[1];
				System.out.println(X[i][0]);
				System.out.println(X[i][1]);
				
			}

	}

}
