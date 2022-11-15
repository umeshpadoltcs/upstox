package Hierarchy_inheritance;

public class Hierarchy {//user logic class
	
	public static void main (String[]args) {
		
		System.out.println("properties of Son1");
		
		Son1 U=new Son1();
		U.moblile();
		U.home();
		U.money();
		
		
		
		System.out.println("properties of Son2");
		
		Son2 U2 =new Son2();
		U2.seconhandbike();
		U2.home();
		U2.money();
		
		
		
		System.out.println("properties of Son3");
		
		Son3 U3=new Son3();
		
		U3.laptop();
		U3.home();
		U3.money();
		
	}

}
