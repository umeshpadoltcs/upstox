package Scanner;

import java.util.Scanner;

public class scan {
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("ley user inter first number");
	int num1=s.nextInt();
	
	System.out.println("ley user inter second num");
	int num2=s.nextInt();
	
	//add two numbers
	
	System.out.println(num1+num2);
 }
}