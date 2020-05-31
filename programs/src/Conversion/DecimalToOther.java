package Conversion;

public class DecimalToOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=45;
		String s="0123456789ABCDEF";
		String out=" ";
		int p=16;
		while(n>0) {
			int rem=n%p;
			out=out+s.charAt(rem);
			 n=n/p;
		}
		System.out.println(out);

	}

}
	