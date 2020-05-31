package string;

public class ReverseSecondWord {

	public static void main(String[] args) {
		String s="java is programing language";
		String out = reverseSecondWord(s);
		System.out.println("reverse is : "+ out);

	}
	 static String reverseSecondWord(String s) {
		char[] ch = s.toCharArray();
		int count=1;
		String out="";
		for(int i=0;i<ch.length;i++) {
			String res="";
			while(i<ch.length && ch[i]!=' ') {
				if(count%2!=0) {
					res=res+ch[i];
					
				}
				else {
					res=ch[i]+res;
				}
				i++;	
			}
			out=out+res+" ";
			count++;
			
		}
		return out;
		
		
	}
	
}
