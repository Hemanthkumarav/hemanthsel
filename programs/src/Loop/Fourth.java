package Loop;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=123;
   int count=0;
   int add=0;
   while(n>0) {
	   
	   count=n%10;
	  
	   if(count==7) {
		   add++;
	   }
	   n=n/10;
   }
   System.out.println(add);
	}

}