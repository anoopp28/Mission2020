package Code;

public class TwoDimension {

	public static void main(String[] args) {
	
		int a[][] = new int[10][2];
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<2; j++) {
				a[i][j]=i+j;
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
