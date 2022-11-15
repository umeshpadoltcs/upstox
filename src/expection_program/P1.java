package expection_program;

public class P1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
		}
		catch(ArithmeticException monky) {
		}
		
		System.out.println("i idiot enter valid denominator");
	
		System.out.println ("exception is handled");
	}
		
}
