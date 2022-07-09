package org.string;
import java.util.*;

public class Equal {
	
	static boolean details() {
		Scanner d = new Scanner(System.in);
		System.out.println("enter your data ");
		String name =d.nextLine();
		System.out.println("enter your data2");
		String name1 = d.nextLine();
		
boolean equals = name.equals(name1);
return equals;
	}
	
	public static void main(String[] args) {
		
		boolean details = details();
		System.out.println(details);
	}
	
	
	
	
	
	
	
	
}