package TwoDarray;

import java.util.Scanner;

public class Sumof2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      int sum=0;
		int a[][]=new int[3][4];
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the elements are:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
				
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum=sum+a[i][j];
				
			}
		}
		System.out.println("sum is:"+ sum);


	}

}
