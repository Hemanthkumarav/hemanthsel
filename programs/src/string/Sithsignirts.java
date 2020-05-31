package string;

import java.util.Scanner;

public class Sithsignirts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		//System.out.println("word wise reverse is :"+wordWiseReverse(s));
		//System.out.println("word reverse is:"+wordReverse(s));
		System.out.println("count num and add character"+ countAdd(s));

	}

static String wordWiseReverse(String s) 
{
	char[] ch = s.toCharArray();
	String out="";
	for(int i=0;i<ch.length;i++) {
		String res="";
		while(i<ch.length && ch[i]!=' ') {
			
			res=res+ch[i];
			i++;
			                             }
		out=out+res+res.length();
	                                   }
	return out;	
		
	}
static String wordReverse(String s) {
	char[] ch = s.toCharArray();
	String out="";
	for(int i=0;i<ch.length;i++) {
		String res=" ";
		while(i<ch.length && ch[i]!=' ') {
			res=res+ch[i];
			i++;
		}
		out=res+out;
	}
	return out;
	
}
static String countAdd(String s) {
	char[] ch = s.toCharArray();
	String out="";
	for(int i=0;i<ch.length;i++) {
		String rev = " ";
		int sum=0;
		while(i<ch.length && ch[i]!=' ') {
			
			if(ch[i]>=48 && ch[i]<=57) {
				sum=sum+(ch[i]-48);
				
			}
			else {
				rev=rev+ch[i];
			}
			i++;
			
		}
		out=out+rev+sum;
	}
	
	return out;
	
}

}
