package non_static_method;

public class d {

	public static void main(String[]args)
	
	{System.out.println("main method start");
	
	d s =new d();//object
	s.m1();
	
	s.m2();
	
	
	System.out.println("main method close");
	}
	
	public void m1()
	{
	System.out.println("i am running from non static method m1");}
	
	public void m2()
	{System.out.println("i am running from non static mathod m2");	
	}
	
	
}
