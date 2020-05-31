package string;

public class ReplaceWordInSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="amit works in accoliate and accoliate is good";
		String s2="amit";
		String s3="accoliate";
		String out = replace(s1,s2,s3);
		System.out.println("res is :"+out);

	}
	static String replace(String s1,String s2,String s3) {
		char[] ch = s1.toCharArray();
		String out="";
		for(int i=0;i<ch.length;i++) {
			String res="";
			while(i<ch.length && ch[i]!=' ') {
				res=res+ch[i];
				i++;
			}
			if(res.equals(s2)) {
				out=out+s3+" ";
				
			}
			else if(res.equals(s3)) {
				out=out+s2+" ";
			}
			else
			out=out+res+" ";
		}
		return out;
		
		
	}

}
