package Compile_time_polymorphism;

public class method_overloading {//blc
	
	public void addition(int a,int b)
	
	{System.out.println("addition:"+(a+b));
		
	}
	
	public void addition(int a,int b,int c)
	
	{System.out.println("additon:"+(a+b+c));}
	
	
	public static void main(String[]args) {
		
		method_overloading mo=new method_overloading();
		
		mo.addition(88,2);
	    mo.addition(12,11,5);
}
	
}

