package Number;

public class StringToInt {

	public static void main(String[] args) {
		String s1="98678901234";
				int a=0;
				int out=0;
				int sum=0;
				int res=0;
				while(a<s1.length())
				{
				char c1=s1.charAt(a++);
				 res=c1-48;
				out=out*10+res;
				
				System.out.print(res);
				
				}
				sum=res+10;
				System.out.println(sum);
				
				//System.out.println(out);
		
		

	}

}
