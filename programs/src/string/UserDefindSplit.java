package string;

public class UserDefindSplit {
public static void main(String[] args) {
		
	
	String s="hello gpegb heghdehjk";
	String[] res=s.split("k");
	for(int i=0;i<res.length;i++) {
		System.out.println(res[i]);
	}
	

System.out.println("--------->");
 splitUser("hello gpegb heghdehjk",'k');


	}

	
	 static void splitUser(String s1,char c) 
	 { 
		 char[] ch = s1.toCharArray();
		 
	  String[] str=new String[countwords(s1,c)]; 
	  int a=0;
	  
	  for(int i=0;i<ch.length;i++)
	  { 
		  String res=""; 
	 while(i<ch.length&& ch[i]!=c ) {
	  res=res+ch[i]; 
	  i++; 
	  } 
	
		 //str[a++]=res;
	  System.out.println(res);  
	  }
	
	//return str; 
	 
	  }
	 
	
	 static int countwords(String s1, char c2)
	 { // TODO Auto-generated method
		 char[] ch = s1.toCharArray();
			int count=1;
			
			
			if(ch[0]==' ') {
				count=0;
			}
			for( int i=0;i<ch.length;i++) {
				if(ch[i]==c2 && ch[i+1]!=c2) {
					count++;
				}
			}
			return count;
}
}