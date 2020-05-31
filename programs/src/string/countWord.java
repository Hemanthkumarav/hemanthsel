package string;

public class countWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="    good      mornig               sir";
		char[] ch = s.toCharArray();
		int count=1;
		char c1='g';
		
		if(ch[0]==' ') {
			count=0;
		}
		for( int i=0;i<ch.length;i++) {
			if(ch[i]==c1 && ch[i+1]!=c1) {
				count++;
			}
		}
System.out.println(count);
	}

}
