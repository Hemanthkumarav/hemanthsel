package programsjava;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int div=2; int number=7; int quotient=0; while(number>=div) {
		 * number=number-div; quotient++;
		 * 
		 * }
		 */
		int number = 100;
		int div=10;
		int quotient;
		for( quotient=0;number>=div;quotient++) {
			number=number-div;
			
		}
  System.out.println("remenider is:" +number);
  System.out.println("quotient is :"+quotient);

	}

}
