package Number;

public class Program23 
{
public static void main(String[] args)
{
	int a=5;
	int b=12;
	int max=(a>b)?a:b;
	int temp=max;
	rec(a,b,max,temp);
}
public static void rec(int a,int b,int max,int temp) {
	if(true)
	{
	if(max%a ==0 && max%b==0)
	{
		System.out.println(max);
		return;
	}
	max=max+temp;
	rec(a,b,max,temp);
	}
	
}
}