package string;

public class AmountInWords {
	static String out="";	
	public static void main(String[] args) {
		
int num=123456789;
concat(num/10000000);
concat((num/100000)%100);
concat((num/1000)%100);
out=out+num%1000;
System.out.print(out);

		

	}
	public static void concat(int num) {
		
		if(num>0) {
			
			out=out+num+",";
			
		}
		
	}

}
