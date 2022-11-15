package non_static_method;

public class Demo1 {

	public static void main(String[]args)
	
	{System.out.println("main method start");
	
	Demo1 F =new Demo1();
	F.U12();
	F.U23();
	F.U36();
	
	
	System.out.println("main method close");}
	
	
	public void U12()
	{System.out.println("i am running from non static method up12");}
public void U23()
{System.out.println("i am running form non static method up23");}

public void U36()

{System.out.println("i am running form non static method");}



}