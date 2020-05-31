package Number;

public class DecimlToOctal {
	public static void main(String args [])
	 {
	  int num=25;
	  String out=" ";
	  while(num>0)
	  {
	   int rem=num%8;
	   num=num/8;
	   out=rem+""+out;
	  }
	  System.out.println(out);
	 }

}
