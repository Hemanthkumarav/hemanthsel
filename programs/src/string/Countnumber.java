package string;

public class Countnumber {

	public static void main(String[] args) {
		String s="th2i4s i8s st6r1i2ng";
		  char[] ch = s.toCharArray();
		  String rev = "";
		  for (int i = 0; i < ch.length; i++) {
		   int sum = 0;
		   String str = "";
		   while (i != ch.length && ch[i] != ' ') {
		    if (ch[i] >= 48 && ch[i] <= 56) {
		     sum = sum + (ch[i] - 48);
		     i++;
		    } else {
		     str = str + ch[i];
		     i++;
		    }
		   }
		   rev = rev + str + sum;
		  }
		  System.out.println(rev);
		 }


}
