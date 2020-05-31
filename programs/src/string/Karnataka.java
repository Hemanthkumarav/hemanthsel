package string;

public class Karnataka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="karnataka@123";
		char[] ch = s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			if((ch[i]>=48)&&(ch[i]<=57)) {
				sum=sum*10+(ch[i]-48);
			}
		}
System.out.println(sum);
	}

}
