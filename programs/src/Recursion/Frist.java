package Recursion;

public class Frist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	printinc(2);

}
	static void printinc(int n) {
		if(n<=9) {
			System.out.println(n);
			n++;
			printinc(n);
			
		}
		
		
	}
	
}
