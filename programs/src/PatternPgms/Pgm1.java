package PatternPgms;

public class Pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int count=1;
	
	
		for(int i=0;i<n;i++) {
			count=i+1;
			for(int j=0;i>=j;j++) {
				
				
					System.out.print(count+ " ");
					count=count+(n-1)-j;
					
			}
			
			
			
			System.out.println();
			
		} 

	}

}
