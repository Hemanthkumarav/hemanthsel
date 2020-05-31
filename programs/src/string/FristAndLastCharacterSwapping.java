package string;

public class FristAndLastCharacterSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is java program";
		char[] ch = s.toCharArray();
		String out="";
		for(int i=0;i<ch.length;i++) {
			String res=" ";
			while(i<ch.length && ch[i]!=' ') {
				
				
				res=res+ch[i];
				i++;
			}
			char[] ch2 = res.toCharArray();
			char temp=ch2[0];
			ch2[0]=ch2[ch2.length-1];
			ch2[ch2.length-1]=temp;
			res=new String(ch2);
			out=out+res;                                                                                      
		}
System.out.println(out);
	}

}
