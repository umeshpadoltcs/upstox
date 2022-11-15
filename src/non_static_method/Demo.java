package non_static_method;

public class Demo {

	
	public static void main(String[]args)
	
	{System.out.println("main method start");
	
	Demo H=new Demo();
	
	H.N1();
	H.N2();
	H.N4();
	
	
	
	System.out.println("main method close");}

	public void N1()
		
	{System.out.println("i im running from non static method N1");}
	
	public void N2()
	{System.out.println("i am running from non static method N2");}
	
	public void N4()
	{System.out.println("i am running from non static method ");}
	
	
}



