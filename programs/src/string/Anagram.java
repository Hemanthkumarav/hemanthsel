package string;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Mother In Law";
				String s2="Hilter Woman";
				s1=removeSpace(s1);
				s2=removeSpace(s2);
		System.out.println(s1);
		System.out.println(s2);
		if(s1.length()!=s2.length()) {
			System.out.println("it is not anagram");
		}
		else {
			s1=lowercase(s1);
			System.out.println(s1);
			s2=lowercase(s2);
			System.out.println(s2);
			s1=sort(s1);
			System.out.println(s1);
			s2=sort(s2);
			System.out.println(s2);
			boolean res = isCompare(s1,s2);
			if(res==true) {
				System.out.println("it is a anagram");
			}
			else {
				System.out.println("not a anagram");
			}
		}

	}
	static  String removeSpace(String s) {
		char[] ch = s.toCharArray();
		String out="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ')	{
				out=out+ch[i];
			}
			
		}
		return out;
		
	}
	static String lowercase(String s1) {
		char[] ch = s1.toCharArray();
		String out="";
		for(int i=0;i<ch.length;i++) {
			String res="";
			if(ch[i]>=65 && ch[i]<=90) {
				res=res+(char)(ch[i]+32);
				
			}
			else {
				res=res+ch[i];
			}
			out=out+res;
		}
		return out;
	}
	static String sort(String s) {
		char[] ch = s.toCharArray();
		String out="";
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp =ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				              }
			                              }
			out=out+ch[i];
			
		                             }
		return out;
	}
	static boolean isCompare(String s1,String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		for(int i=0;i<ch1.length;i++)
		if(ch1[i]!=ch2[i]) {
			return false;
		}
		return true;
		
	}

}
