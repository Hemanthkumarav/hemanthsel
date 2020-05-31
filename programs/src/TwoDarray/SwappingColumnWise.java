package TwoDarray;

import java.util.Scanner;

public class SwappingColumnWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int m=sc.nextInt();
		int a[][]=new int[m][m];
		System.out.println("enter the elements to an array:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter elements are:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"("+i+","+j+")");
			}
			System.out.println();
			}
		for(int i=0,n=a.length-1;i<a.length/2;i++,n--) {
			for(int j=0;j<a[i].length;j++) {
				int temp=a[i][j];
				a[i][j]=a[n][j];
				a[n][j]=temp;
			}
		}
		System.out.println("Array elements after the swapping Rowwise:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"("+i+","+j+")");
			}
			System.out.println();}
		

	}

}
