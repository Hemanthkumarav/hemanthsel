package Number;

public class Fibonnci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=0;
		int n=10;
		fib(a,b,c,n);
		
		}
	static void fib(int a,int b,int c,int n) {
		 
		if(n>0) {
			System.out.println(a);
			c=a+b;
			a=b; 
			b=c;
			n--;
			fib(a, b,c,n);

		}
	
	}

}
