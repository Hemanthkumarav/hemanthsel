package Array;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60,70};
		
		int n=a.length-1;
		for(int i=0;i<a.length/2;i++) {
		int temp=a[i];
		a[i]=a[n];
		a[n]=temp;
		n--;
		
		
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
