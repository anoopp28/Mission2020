package Code;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class ProfilePic {
    public static void main(String args[] ) throws Exception {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
    	    int L = Integer.parseInt(line);
			line = br.readLine();
    	    int N = Integer.parseInt(line);
			int X[][]=new int[N][2];
			for(int i=0;i<N;i++){
				String input=br.readLine();
				String[] tokens = input.split(" ");
				X[i][0]=Integer.parseInt(tokens[0]);
				X[i][1]=Integer.parseInt(tokens[1]);
				System.out.println(X[i][0]);
				System.out.println(X[i][1]);
			}
			for(int i=0;i<N;i++){
				if(X[i][0]<L||X[i][1]<L){
					System.out.println("UPLOAD ANOTHER");
				}
				else if(X[i][0]>=L&&X[i][1]>=L){
					if(X[i][0]==X[i][1])
						System.out.println("ACCEPTED");
					else
						System.out.println("CROP IT");
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
        
        
 
    }
}