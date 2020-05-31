package PraticePGM;

public class ComputerAndProgramResultCute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="computer";
		String s2="program";
			String out = iscompare(s2,s1);
			System.out.println("commom letter is:"+out);

	}

	 static String iscompare(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		String res="";
		for(int i=0;i<ch1.length;i++) {
			int count=0;
			for(int j=0;j<ch2.length;j++) {
				if(ch1[i]==ch2[j]) {
					count++;
					break;
				}
				
			}
			
			if(count==0) {
				res=res+ch1[i];
			}
			
		}
		
		return res;
		
	}

}
