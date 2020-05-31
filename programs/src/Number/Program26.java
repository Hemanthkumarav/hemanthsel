package Number;

public class Program26
{
public static int power(int num,int pwr)
{
	int out=1;
	for(int i=1;i<=pwr;i++)
	{
		out=out*num;
	}
	return out;	
}
	public static void convert(int num)
	{
		int count=0;
		int out=0;
		while(num!=0)
		{
		int rem=num%10;//exract the last digit
		out=out+(rem*power(2,count++));//mul with power of given number
		num=num/10;//eliminate the last digit
		}//end when num==0
		System.out.println(out);
	}
	public static boolean isBinary(int num)
	{
		while(num!=0)
		{
		int rem=num%10;
		if(rem>1)	
		{
			return true;
		}
		num=num/10;
		}
		return true;
	}
public static void main(String[] args)
{	
	int num=11001;
	boolean res=isBinary(num);
	if(res)
	{
	convert(num);
	}
	else
	{
		System.out.println("cannot convert it is not binary number");
	}
	//System.out.println(0B1101101);
	int bin=0B11001;//binary
	System.out.println(bin);//display==>decimal
		/*
		 * int octal=025;//octal System.out.println(octal); int hexa=0xb6;//hexa
		 * System.out.println(hexa);
		 */
	
}
}