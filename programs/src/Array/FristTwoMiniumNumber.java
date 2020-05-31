package Array;

public class FristTwoMiniumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,9,7,6,5};
		int minfrist=a[0];
		int minsecond=a[1];
		for(int i=1;i<a.length;i++) {
			if(a[i]<minfrist) {
				minsecond=minfrist;
				minfrist=a[i];
				
			}
			else if(a[i]<minsecond) {
				minsecond=a[i];
				
			}
		}
		System.out.println("min frist is:"+ minfrist);
		System.out.println("min second is:"+ minsecond);

	}

}
