package Static_method;

public class static_regular_method_call_from_same_class {//class body 
	
	public static void main(String[]args) {
		
		System.out.println("main method is start");
		
		M1();
		
		M2();
		
		M3();
	
		System.out.println("main method is close");
	}
	
	
	public static void M1()
	
	{System.out.println("i am running form regular method M1");}
	
	public static void M2()
	{System.out.println("i am running from regular method M2");}
	
	public static void M3()
	{System.out.println("i am running from regular method M3");
			
	}
}