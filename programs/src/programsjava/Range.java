package programsjava;

public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		if(n%3==0 && n%2==0) {
			System.out.println("Delhi");
			
		}
		else if(n%2==0) {
			System.out.println("Banglore");
		}
		else if(n%3==0) {
			System.out.println("Mumbi");
		}
		else
		{
			System.out.println("Kolkata");
		}

	}

}
