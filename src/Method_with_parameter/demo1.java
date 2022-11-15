package Method_with_parameter;

public class demo1 {
public static void main(String[]args) {
	
	addition(10,20,60);//compile time binding (CBT)
	
	
}


public static void addition(int a,int b,int c){//FORMAL ARGUMENTS

int d=a+b+c;
System.out.println(d);
	
}
}
