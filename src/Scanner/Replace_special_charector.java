package Scanner;

import java.util.Scanner;

public class Replace_special_charector {
public static void main(String[] args) {
	Scanner oo=new Scanner(System.in);
	System.out.println("enter string which contains special charector");
	String name=oo.next();
	String correctname=name.replace("$","s");
	System.out.println(correctname);
}
}

