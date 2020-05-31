package string;

public class FristAndLastUpper {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			String s="this is java program";
			char[] ch = s.toCharArray();
			String out="";
			for(int i=0;i<ch.length;i++) {
				String res="";
				while(i<ch.length && ch[i]!=' ') {
					
					
					res=res+ch[i];
					i++;
				}
				char[] ch2 = res.toCharArray();
				 ch2[0]=(char)(ch2[0]-32);
				ch2[ch2.length-1]=(char)(ch2[ch2.length-1]-32);
				res=new String(ch2);
				out=out+res;
	}
			System.out.println(out);

}
}