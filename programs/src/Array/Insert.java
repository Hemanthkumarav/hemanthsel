package Array;

public class Insert {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int index=2;
		int element=4;
		insert(a,index,element);
		int indexremove=0;
		delete(a,indexremove);
	

	}
	static void insert(int a[],int index,int element) {
		
		int b[]=new int[a.length+1];
		b[index]=element;
		for(int i=0;i<index;i++) {
			b[i]=a[i];
			
		}
	
			
		
		for(int i=index;i<a.length;i++) {
			b[i+1]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("-------*********----------");
		
		
	}
	  static void delete(int a[],int index) {
		  int c[]=new int[a.length-1];
		  if(index==0) {
			  for(int i=0;i<a.length-1;i++) {
				  c[i]=a[i+1];
			  }
			  
		  }
		  else {
		 for(int i=0;i<index;i++) {
			 c[i]=a[i];
		 }
		 for(int i=index;i<a.length;i++) {
			 c[i-1]=a[i];
		 }
		  }
		 for(int i=0;i<c.length;i++) {
			 System.out.println(c[i]);
		 }
		  
		  
	  }

}
