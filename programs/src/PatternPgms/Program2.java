package PatternPgms;

public class Program2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int count=1;
	
	
		for(int i=0;i<n;i++) {
			
			for(int j=0;i>=j;j++) {
				
				if((i+j)%2!=0)
					System.out.print("0" + " ");
				else System.out.print("1" + " ");
				}
			
			
			
			System.out.println();
			
		} 


}
}
