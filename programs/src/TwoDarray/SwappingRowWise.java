package TwoDarray;

public class SwappingRowWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
System.out.println("elements before swapping:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ("+i+","+j+")");
			}
			System.out.println();
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0,n= a[i].length-1;j<a[i].length/2 ;j++,n--) {
				
				
				int temp=a[i][j];
				a[i][j]=a[i][n];
				a[i][n]=temp;
			
			}
		}
		System.out.println("elements after swapping:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ("+i+","+j+")");
			}
			System.out.println();
			}
		

	}

}
