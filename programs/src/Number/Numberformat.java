package Number;

public class Numberformat {

	public static void main(String[] args) {
	int n=345677;
	String out="";
	
	out=out+","+n%1000;
	System.out.println(out);
	out=","+((n/1000)%100)+out;
	System.out.println(out);
	out=","+((n/100000)%100)+out;
	System.out.println(out);
	out=(n/10000000)+out;
	System.out.println(out);
	
	}
	
	}
	

