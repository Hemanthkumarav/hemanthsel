package PatternPgms;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		
 for(int rows=0;rows<n;rows++) {
	 
	 for(int space=0;space<n-1-rows;space++) {
		 System.out.print(" "+"("+rows +","+space+")");
	 }
	 for(int starts=0;(2*rows)>=starts;starts++) {
		 if(starts==0|| starts==2*rows)
		 System.out.print("* ");
		  }
	 System.out.println();

	 }
 for(int rows=n-2;rows>=0;rows--) {
	 for(int space=0;space<n-1-rows;space++) {
		 System.out.print(" "+"("+rows +","+space+")");
	 }
	 for(int starts=0;(2*rows)>=starts;starts++) {
		 System.out.print("*" +"("+rows +","+starts+")");
	 }
	 System.out.println();

	 }
	
 }
	}


