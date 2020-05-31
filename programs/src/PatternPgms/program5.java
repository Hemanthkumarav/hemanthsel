package PatternPgms;

public class program5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int count=1;
	
	
		for(int i=0;i<n;i++) {
		
			for(int j=0;i>=j;j++) {
				
				System.out.print(count--);
				count=count+2;
				
			}
			System.out.println();
			
		} 

}
}
