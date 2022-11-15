package Logical_Program;

public class Polindrome {

	public static void main(String[] args) {
		
	String org= "MOM";
	
	String rev="";
	
	for(int i=org.length()-1;i>=0;i--){
		
		rev=rev+org.charAt(i);}
	
		System.out.println(rev);//check whether it is polindrome
		
		if(org.equals(rev)) {
			System.out.println("given string is polindrome");
		}
		
		else 
		
		{System.out.println("given string not polindrome");
	}
		
	}
}	
	

