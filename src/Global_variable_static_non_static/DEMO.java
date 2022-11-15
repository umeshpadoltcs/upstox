package Global_variable_static_non_static;

public class DEMO {//Global variable
	
	static int i=10;//static global variable
	
	int j=20;//non static global variable.
	
	static byte o=50;//static global variable.
	
	static short s =66;//static global variable.
	
	long l=154663666l;//non static global variable.
	
	public static void main(String[]args){//main method body start

	System.out.println(i);//10 this is static variable no need to object.
	
	DEMO D =new DEMO();//This is non static global variable need for create the object
	
	System.out.println(D.j);//20
	
	System.out.println(o);//50 static global variable no need object.
	System.out.println(s);//
	
	DEMO U=new DEMO();
	System.out.println(U.l);//1546636661
	
		
	}//main method body close	
		
}//class body close
