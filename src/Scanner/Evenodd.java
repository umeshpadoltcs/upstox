package Scanner;

import java.util.Scanner;

public class Evenodd {
public static void main(String[] args) {
	Scanner you=new Scanner(System.in);
	System.out.println("ley user inter number");
	
	int number=you.nextInt();
	
	if(number%2==0)
	{System.out.println("given number is even");}
	
	
	else {System.out.println("given number is odd");}
}
}
