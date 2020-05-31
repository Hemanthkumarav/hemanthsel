package Number;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int n=1101;//13
	
		  boolean result=isBinary(n); 
		  if(result) { 
			  convert(n); 
		  } 
		  else {
		  System.out.println("it is not "); 
		  }
		 
		//System.out.println(n);
		
		
	

	}
	
	static int power(int n,int count) {
		int pw=1;
		while(count>0) {
		pw=pw*n;
		count--;
		}
		return pw;
	}
	static boolean isBinary(int n) {
		while(n!=0) {
		int rem=n%10;
		if(rem>1) {
			return false;
		}
		n=n/10;
		}
		return true;
		
	}
	static void convert(int num) {
		int count=0;
		int out=0;
		while(num!=0)
		{
		int rem=num%10;//exract the last digit
		out=out+(rem*power(2,count++));//mul with power of given number
		num=num/10;//eliminate the last digit
		}//end when num==0
		System.out.println(out);
		
	}
	
	

}
