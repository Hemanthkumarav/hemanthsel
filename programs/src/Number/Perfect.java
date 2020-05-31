package Number;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=1000;
		System.out.println("range");
		rangeOfPerfect(range);
		System.out.println("sum");
		sumOfPerfect(3);
		
		
		
	}
	static boolean perfect(int n) {
		int sum=0;
		int temp=n;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			
	}
		if(sum==temp) {
			return true;
		}
		else 
			return false;
		
	}
	static void rangeOfPerfect(int range) {
		for(int i=1;i<=range;i++) {
			boolean result=perfect(i);
			if(result==true) {
				System.out.println(i);
			}
			
		}
		
	}
	static void sumOfPerfect(int ra) {
		int sum=0;
		int counter=1;
		for(int i=1;counter<=ra;i++) {
			boolean result=perfect(i);
			if(result==true) {
				counter++;
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
