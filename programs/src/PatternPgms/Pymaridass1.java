package PatternPgms;

public class Pymaridass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int count=1;
		int starts=0;
		for(int rows=0;rows<n;rows++) {
			for(int space=0;space<n-1-rows;space++) {
				System.out.print("  ");
			}
			for( starts=0;2*rows>=starts;starts++) {
				System.out.print(count++ +" ");
			}
				
			if(starts<=rows) {
				count++;
			}
			else {
				count--;
			}
			
			
			System.out.println();
		}
		

	}

}
