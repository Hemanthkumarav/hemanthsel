package Recursion;

public class FactRecurrsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=16;
		long i=1;
		fact(n,i);
		

	} static long fact1=1;
	static void fact(long n ,long i) {
		


		if(i<=n) {
			fact1=fact1*i;
			i++;
			fact(n,i);
		}
		if(i==n) {
		System.out.println(fact1);
	}
	}
	

}
