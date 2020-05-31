package Number;

public class Strongnumber {
	public static void main(String[] args) {
		int range=10000;
		System.out.println(numrange(range));
	}
	static boolean extract(int n) {
		int temp=n;
		int sum=0;
		 while(n>0) {
			 int rem=n%10;
			 sum=sum+fact(rem);
			  n=n/10;
			 
		 }
		return (sum==temp);
		
		
	}
	static int fact(int rem) {
		int fsum=1;
		for(int i=1;i<=rem;i++) {
			fsum=fsum*i;
		}
		return fsum;
	}
	 static boolean numrange(int range) {
		 boolean correct = false;
		 for(int i=1;i<=range;i++) {
			 correct= extract(i);
			 
		 }
		
		return (correct==true);
	
		 
	 }
	
	 
	

}
