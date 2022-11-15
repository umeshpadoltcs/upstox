package non_static_method;

public class demo123 {
  public static void main(String[]args)
  {
	  System.out.println("main method start");
	  
	  demo123 h=new demo123();
	  h.n2 ();
	  h.n3 ();
	  
	  System.out.println("main method end");
  }
  
  public void n2()
  {System.out.println("i am running form n2 non static method");
  }
  public void n3()
  {System.out.println("i running form n3 non static method");
  }
  }
 
