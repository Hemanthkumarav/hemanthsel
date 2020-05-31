package Array;

public class LengthOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,00,0};
		int num=a.length;
		fact(num);
		

	}
	static void fact(int num) {
		int fact1=1;
		int sum=0;
		for(int i=1;i<=num;i++) {
		fact1=fact1*i;
		
	}
		sum=fact1-1;
		System.out.println("fact -1 sum is :" + sum);
	}

}
