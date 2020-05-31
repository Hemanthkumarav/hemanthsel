package Array;

public class Paindrome {

	public static void main(String[] args) {
		int a[]= {12,25,13,25,12};
		boolean result=reverse( a);
		if(result==true) {
		System.out.println(" it is a pailndrome");
		}
		else {
			System.out.println("it is not a pailndrome");
		}
		
	}
	static boolean reverse(int a[]) {
		int n=a.length-1;
		int i,j;
		for( i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[n];
			a[n]=temp;
			n--;
		}
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("----------------");
				
				for(j=0;j<a.length;j++) {
			System.out.println(a[j]);
				}
				for( i=0,j=0;i<a.length;i++,j++) {
			if(a[i]!=a[j]) {
				return false;
			}
			
				}
				return true;
		
		
	

	}

}
