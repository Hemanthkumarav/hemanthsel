package string;

public class SwapThisToShit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="this is java program";
		String out = swap(s1);
		System.out.println(out);

	} static String swap(String s1) {
		char[] ch = s1.toCharArray();
		String out="";
		for(int i=0;i<ch.length;i++) {
			String res="";
			while(i<ch.length && ch[i]!=' ') {
				res=res+ch[i];
				i++;
			}
			//char[] ch2 = res.toCharArray();
			/*
			 * ch2[0]=(char)(ch2[0]-32); ch2[ch2.length-1]=(char)(ch2[ch2.length-1]-32);
			 */
			
			   char temp=ch[0];
			 ch[0]=ch[ch.length-1];
			 ch[ch.length-1]=temp;
			 
			res=new String(ch);
			out=out+res+" ";
		}
		
		return out;
		

	}
	

}
