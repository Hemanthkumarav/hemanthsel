
package string;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="programing";
		String s2="ingprogram";
		s1=s1+s1;
		System.out.println(s1);
		boolean res = rotate(s1,s2);
		if(res==true) {
			System.out.println("it is a rotation");
		}
		else {
			System.out.println("not a rotation");
		}
		
		}
		static boolean rotate(String s1,String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		
		for(int i=0;i<ch1.length;i++) {
			int j=0;
			int k=i;
	while(j<ch2.length && k<ch1.length &&ch2[k]==ch2[j]) {
		k++;
		j++;
	}
	
		
		if(j==ch2.length) {
			return true;
		}
		
		}
		return false;

	}

}
