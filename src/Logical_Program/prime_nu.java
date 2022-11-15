package Logical_Program;

public class prime_nu {
	public static void main(String[] args) {
		int num =3;
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if(num%1==0) {
				count++;
			}
		}
			
			if (count>2) {
				System.out.println("number is prime");}
			
			
		else
		{System.out.println("num is not prime");}
				
	}
}
	
