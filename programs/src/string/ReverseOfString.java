package string;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		char[] ch =s1.toCharArray();
		for(int i=0,j=ch.length-1;i<ch.length/2;i++,j--) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		System.out.println("reverse elements is");
		String out=" ";
		for(int i=0;i<ch.length;i++) {
			out=out+ch[i];
		}
		System.out.println(out);

	}

}
