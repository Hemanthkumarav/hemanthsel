package Loop;

public class Third {

	public static void main(String[] args) {
		int n=126;
		int count=0;
		int sum=0;
		int digit=0;
		
		while(n>0) {
			
			digit=n%10;
			n=n/10;
			sum=sum+digit;
		}

	
	
		System.out.println(sum);

}
}
