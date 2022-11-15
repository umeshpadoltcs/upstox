package Logical_Program;

public class String_reverse_programe {//REVERSE STRING
	
	public static void main(String[] args) {
		
	
	String org1="UMESH";
	
	
	String rev1="";
	
	
	for(int i = org1.length()-1;i>=0;i--)
		
	{
		rev1=rev1+org1.charAt(i);
		
		
	}
	System.out.println(rev1);
}

}

