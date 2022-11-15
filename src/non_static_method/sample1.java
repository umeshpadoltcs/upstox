package non_static_method;

public class sample1 {
	
 public static void main(String[]args)
 
 {System.out.println("main method is start");
 
 
 sample1 S=new sample1();
 S.m3();
 S.m4();
 S.m6();
 
 
 System.out.println("main method is close");}

public void m3()
{System.out.println("i am running form non static method m3 ");}
	 
public void m4()
{System.out.println("i am running form non static method m4");}

public static void m6()
{System.out.println("i am running form static method m6");}
	
	
	
	
	
}
	

