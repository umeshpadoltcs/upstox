package Control_Condition_Statments;

public class demo3_if_else_ladder {
	
	public static void main(String[] args) {
		int marks=52;
		
		if(marks>=75)
		{System.out.println("pass with distinction");
		}
			
		else if (marks>=60)
		{System.out.println("pass with 1st class");
		}
		
		else if (marks>=50)
		{System.out.println("pass with 2nd class");
		}
		else if (marks>=40)
		{System.out.println("pass with 3rd class");
		}
		else if (marks>=30)
		{System.out.println("pass");	
		}
		else {System.out.println("fail");
		}
		
		}
	}


