package TwoDarray;

import java.util.Scanner;

public class RightRoation {
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
		int b[][]=new int[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i!=j){
			b[i][j]=a[j][i]	;
				}
				else {
					 b[i][j]=a[i][j];
				}
			}
			
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0,n= b[i].length-1;j<b[i].length/2 ;j++,n--) {
				
				
				int temp=b[i][j];
				b[i][j]=b[i][n];
				b[i][n]=temp;
			
			}
		}
		System.out.println("after Right roation  elements are:");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+"("+i+","+j+")");
			}
			System.out.println();
		}
		
                                               }

}
