package Scanner;

import java.util.Scanner;

public class Even_odd {
public static void main(String[] args) {
	Scanner you=new Scanner(System.in);
	System.out.println("user inter number");
	int number=you.nextInt();
	//to check whether number even or odd
	if(number%2==0) {
		System.out.println("given nunber is even");
	}
	else {System.out.println("number is odd");}
}
}
