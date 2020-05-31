package Number;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
	
		int x=1;
		
		while(x!=0){
		
		if(x%a==0 && x%b==0) {
			break;
		}
		x++;
		
		}  
		System.out.println(x);
	
		
		

	}

}
