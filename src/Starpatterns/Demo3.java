package Starpatterns;

public class Demo3 {
public static void main(String[] args) {
	int space=4;
	int star=1;
	for(int i=1;i<=5;i++) {//outer for loop (row)
		for (int j=1;j<=space;j++) {//space
			System.out.print(" ");}
		
		for (int j=1;j<=star;j++) {
			System.out.print("*");}
		
		System.out.println();
		space--;
		star++;
		}
	}
}
