package Number;

public class Frist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(fact(4));
		 

	}
	static int fact1=1;
	public static int fact(int n) {
		
		if(n>=1) {
			fact1=fact1*n;
		
			n--;
			fact(n);
			
			
		}
		return fact1;
		
		
		
		
}

}
