package string;

public class Lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AcbD";
		String out="";
		
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			String res="";
			
			while(i<ch.length && ch[i]!=' ') {
				res=res+(char)(ch[i]+32);
				i++;
			}
			out=out+res;
		}
System.out.println(out);
	}

}
