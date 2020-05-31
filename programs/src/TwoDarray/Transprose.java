package TwoDarray;

import java.util.Scanner;

public class Transprose {

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
		for(int i=0;i<a.length/2;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i!=j) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
			}
		}
		System.out.println("after transprose elements are:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"("+i+","+j+")");
			}
			System.out.println();
		}
		
                                               }
                          }
