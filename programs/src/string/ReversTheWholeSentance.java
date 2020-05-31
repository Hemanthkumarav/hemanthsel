package string;

import java.util.Scanner;

public class ReversTheWholeSentance {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s=sc.nextLine();
String sp=reverseWord( s);
System.out.println(sp);
	}

 static String reverseWord(String s) {
	 char ch[]=s.toCharArray();
	 String out="";
	for(int i=0;i<ch.length;i++) {
		String res="";
		while(i<ch.length && ch[i]!=' '  ) {
			res=res+ch[i];
			i++;
			
		}
		//out=res+out+res.length();
		out=out+res+res.length();
	}
	return out;
}
 }