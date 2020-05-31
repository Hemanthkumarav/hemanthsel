package Array;

public class FristThreeMiniumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,5,1,7,3,40,5};
		int fristmin=a[0];
		int secondmin=a[1];
		int threedmin=a[2];
		for(int i=1;i<a.length;i++) {
			if(a[i]<fristmin) {
				threedmin=secondmin;
				secondmin=fristmin;
				fristmin=a[i];
				
			}
			else if(a[i]<secondmin) 
			{
				threedmin=secondmin;
				secondmin=a[i];
			}
			else if(a[i]<threedmin) {
				threedmin=a[i];
			}
		}
		System.out.println("frist min is:" + fristmin);
		System.out.println("second min is:" + secondmin);
		System.out.println("threed min is:" + threedmin);

	}

}
