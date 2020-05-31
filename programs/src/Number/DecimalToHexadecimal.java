package Number;

public class DecimalToHexadecimal {
	public static void main(String args [])
	 {
	  int num=5675;
	  String out=" ";
	  String s="0123456789ABCDEF";
	  while(num>0)
	  {
	   int rem=num%2;
	   num=num/2;
	   out=s.charAt( rem)+""+out;
	  }
	  System.out.println(out);
	 }

}
