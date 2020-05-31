package Conversion;

public class BinaryOctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0x123BF;
		int out=0;
		int count=0;
		while(num>0) {
		int	rem=num%10;
		out=out+(rem*pow(2,count++));
		num=num/10;
			
		}
		System.out.println(out);
		

	}

	 static int pow(int constant, int count) {
		// TODO Auto-generated method stub
		 int pw=1;
		 while(count>0) {
			 pw=pw*2;
			 count--;
		 }
		 
		return pw;
	}

}
