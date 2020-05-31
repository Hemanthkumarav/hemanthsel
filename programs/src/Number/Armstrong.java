package Number;

public class Armstrong {

	public static void main(String[] args) {
		int range=1000;
		System.out.println("range");
		rangeArmstrong(range);
		System.out.println("sum");
		sumOfArmstrong(4);
		
		
		
		
		
		

	}
	public static boolean isArmstrong(int num) {
		int out=0;
		int temp=num;
		while(num!=0) {
			int rem=num%10;
			out=out+power(rem,countOfDigits(temp));
			num=num/10;
		}
		return temp==out;
	}
	public static int countOfDigits(int num) {
		int count=0;
		while(num!=0) {
			count++;
			
			
		//int rem=num%10;
		num=num/10;
		
		}

		return count;
		
	}
	public static int power(int num,int p) {
		int pw=1;
		while(p>0) {
			pw=pw*num;
			p--;
		}
		return pw;
		
	}
	public static void rangeArmstrong(int range) {
		for(int i=1;i<=range;i++) {
			boolean result = isArmstrong(i);
			if(result==true)
				System.out.println(i);
			
			
		}
	}
	public static void sumOfArmstrong(int ra) {
		int sum=0;
		int counter=1;
		for(int i=1;counter<=ra;i++) {
			boolean result = isArmstrong(i);
			if(result==true) {
				counter++;
				sum=sum+i;
			               }
			
		                           }
		System.out.println(sum);
	}
	

}
