package Number;

public class DecimalToBinary {
	public static void main(String args [])
	 {
	  int num=25;
	  String out=" ";
	  while(num>0)
	  {
	   int rem=num%2;
	   num=num/2;
	   out=rem+""+out;
	  }
	  System.out.println(out);
	 }


}
