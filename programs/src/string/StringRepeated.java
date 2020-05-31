package string;

import java.util.Scanner;

public class StringRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in );
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("array elements are:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		dupilcate(a);
		
		
	}
	static int[] dupilcate(int a[]) {
		int n=a.length;
		int sum=0;
	for(int i=0;i<n;i++) {
		int count=0;
		for(int j=i+1;j<n;j++) {
			if(a[i]==a[j]) {
				count++;
				int k=j;
				while(k<n-1) {
					a[k]=a[k+1];
					k++;
				}
				n--; 
				j--;
			}
		}
		System.out.println(a[i]+"is "+count +" repereted");
		if(count==0) {
			sum=sum+a[i];
		}
		System.out.println("sum is:"+ sum);

	}
	int na[]=new int[n];
	for(int i=0;i<na.length;i++) {
		na[i]=a[i];
	}
	
	
	
	return na;
	
		
	}

}