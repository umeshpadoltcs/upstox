package String_Method;

public class Methods_of_Strings {
	
	public static void main(String[]args)  throws Throwable{
		String s1 ="velocity";
		
		String s2 ="VELOCITY";
		 
		String S3="velo";
		
		//length()  it will contain character in string 
		System.out.println(s1.length());
		
		//toUppercase it will convert lower case value to Upper case value
		System.out.println(s1.toUpperCase());
		
		//toLowercase it will convert Upper case value to lower case value
		
		System.out.println(s2.toLowerCase());
		
		//equals it will compared two string
		
		System.out.println(s1.equals(s2));
		
		//equalsIgnorecase it will compared string ignore case
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//contain ()
		System.out.println(s1.contains(S3));
		
		//charAt it will give particular index
		System.out.println(s2.charAt(0));
		System.out.println(s1.charAt(5));
		System.out.println(s1.charAt(7));
		
		//indexOf it will give index of particular character
		
		System.out.println(s1.lastIndexOf('y'));
		
		System.out.println(s2.indexOf("Y"));
	}
}
