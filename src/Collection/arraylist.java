package Collection;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(100);//arraylist duplicate are allowed
		al.add(145);
		al.add(50);
		al.add("");
		al.add("NULL");
		al.add(1); 
		al.add(23);
		al.add(56);
		al.add(9);
		al.add(5566);
		al.add(5);
		System.out.println("iterator consor");
		
		al.add("ankush");
		System.out.println(al);//
		
		System.out.println(al.size());//6 string method
		
		System.out.println(al.isEmpty());
		
		al.add(3,400);
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
	}
	
	
	
}
