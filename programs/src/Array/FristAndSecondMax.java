package Array;

public class FristAndSecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,32,31,25};
		int maxfrist=a[0];
		int maxsecond=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>maxfrist) {
				maxsecond=maxfrist;
				maxfrist=a[i];
			}
			else if(a[i]>maxsecond) {
				maxsecond=a[i];
			}
		}
		System.out.println("frist max is :"+ maxfrist);
		System.out.println("second max is :"+ maxsecond);

	}

}
