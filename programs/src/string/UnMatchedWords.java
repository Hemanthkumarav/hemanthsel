package string;

public class UnMatchedWords {
	
	static String remove(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		String out="";
		
		for(int i=0;i<ch1.length;i++) {
			int count=0;
			for(int j=0;j<ch2.length;j++) {
			
				if(ch1[i]==ch2[j]) {
				count++;
				break;
		                         }
				                          }
			
		                             
		if(count==0) {
			out=out+ch1[i];
                    }
	}
		return out;
		
		
	}
	public static void main(String[] args) {
		
		String out = remove("program","computer");
		System.out.println( out);
			

		}

	}
