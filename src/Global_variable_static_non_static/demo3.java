package Global_variable_static_non_static;

public class demo3 {//flobal variable
	static int i=45;
	
	int j=26;
	
	static char ch='m';
			
    double b=2.3;
    
    float h=53.5f;
    

   public static void main(String[]args) {
	   System.out.println(i);
	   
	   demo3 d=new demo3();
	   System.out.println(d.j);
	   
	   System.out.println(ch);
	   
	   demo3 b=new demo3();
	   System.out.println(b.b);
	   
	  System.out.println(b.h);
   }
   }


