package PraticePGM;

public class Karnataka123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="karnataka@123";
		int out = addHundared(s);
System.out.println("final after adding 100 is"+ out);
	}
	static int addHundared(String s) {
		char[] ch = s.toCharArray();
		int res=0;
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]>=48 && ch[i]<=57) {
				res=res*10+(ch[i]-48);
			}
		
			System.out.println();
		}
		return res+100;
		
	}

}
