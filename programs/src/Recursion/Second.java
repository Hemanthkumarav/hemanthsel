package Recursion;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(9,2);

	}
	public static void print(int a,int b) {
		if(a>=1) {
			System.out.print(a);
			a--;
			print(a,b);
		}
		else if(b<=9) {
			System.out.print(b);
			b++;
			print(a,b);
		}
	}

}
