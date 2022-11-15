package Scanner;

import java.util.Scanner;

public class Accept_input_from_user {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ley user enter 1st number");//get first number from user
		int num1=scan.nextInt();
		
		System.out.println("ley user inter 2nd number");//get second num
		
		int num2=scan.nextInt();
		
		System.out.println(num1+num2);
	}
	

}
