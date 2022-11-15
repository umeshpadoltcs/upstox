package Global_variable_static_non_static;

public class Sample {//close body open
	
static int i=10;//static global variable
 int k=20;//non static global variable.
 char y='l';//non static global variable.
 boolean b=true;//non static global variable.
 
 public static void main(String[]args) {//main method body start.
	 
	 System.out.println(i);//10 this is static global variable.
	 
	 Sample a=new Sample();//this is non static global variable to create the object.
	 
	 System.out.println(a.k);//20
	 
	 Sample b = new Sample();
	 System.out.println(b.y);
	 
	 Sample T=new Sample();
	 
	 System.out.println(T.b);
	 

	 
 }//main method body is close.

}//class body is close
