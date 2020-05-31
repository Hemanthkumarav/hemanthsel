package Number;

public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=145;
int rem=0;
int sum=0;
int temp=n;
while(n>0) {
	rem=n%10;
	int fact=1;
for(int i=1;i<=rem;i++) {
	fact=fact*i;
	
	
}
sum=sum+fact;
n=n/10;
	}
if(temp==sum)
System.out.println("It is a Strong :" +sum);

	}

}
