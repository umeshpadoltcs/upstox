package Variable;

public class Sample1 {//global variable,always the class body
	
	static int t =20;
	
	float h=65.6f;
			
    char umesh='h';
    
    public static void main(String[]args) {//main method body start
    
    	System.out.println(t);
    	
    	Sample1 D=new Sample1();
    	
    	System.out.println(D.h);
    	System.out.println(D.umesh);
}
}