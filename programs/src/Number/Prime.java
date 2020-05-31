package Number;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=50;
		System.out.println("sum");
		sumOfRange(4);
		

		System.out.println("range");
		rangeOfPrime(range);
					
		}

	

	static boolean isPrime(int n) {
		int count=1;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			count++;
		}
	}
	if(count==2)
	return true;
	else
		return false;
		
	}
	static void rangeOfPrime(int r) {
		for(int i=1;i<=r;i++) {
			boolean result=isPrime(i);
			if(result==true) {
				System.out.println(i);
			}
					
		}
		
	}
	static void sumOfRange(int ra) {
		int sum=0;
		int counter=1;
		for(int i=1;counter<=ra;i++) {
			boolean result=isPrime(i);
			if(result==true) {
				counter++;
				sum=sum+i;
				
			}
		
		}
		System.out.println(sum);
	}

}
