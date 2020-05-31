package Number;

public class LcmUsingRecurssion {

	public static void main(String[] args) {
		int a=5;
		int b=10;	
	int max=a>b?a:b;
	int temp=max;
	 lcmOfTwo(a,b,max,temp);

		
		
	}
	
	
  static void lcmOfTwo(int a, int b, int max,int temp) { if(true) {
	  if(max%a==0 && max%b==0) {
		  System.out.println(max);
		  return;
	  }
	  max=max+temp;
	  lcmOfTwo(a,b,max,temp);
	
  }
		}
}



