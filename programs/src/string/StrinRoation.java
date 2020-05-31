package string;

public class StrinRoation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is a string ";
		int times=10;
		String out = roatate(s,times);
		System.out.println("result is :  "+ out);
		

	}
 static String roatate(String s,int times) {
		// TODO Auto-generated method stub
	char[] ch = s.toCharArray();
	for(int i=0;i<times;i++) {
		char temp=ch[ch.length-1];
		for(int j=ch.length-1;j>=1;j--) {
		ch[j]=ch[j-1];
		}
		ch[0]=temp;
	}
	
	 String ns=new String(ch);
	return ns;
	
	}


}
