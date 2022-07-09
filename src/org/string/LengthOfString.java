package org.string;

import java.util.*;

public class LengthOfString {
	public static void main(String[] args) {
	
		/*Description : Create a new ArrayListlists with values and return the common values
	              Input : List = 10,20,30,90,10,10,40,50
	              Input : List = 30,40,50,60,80*/
		
		
		
		List li =  new ArrayList();
		
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		
		List li1= new ArrayList();
		
		li1.add(30);
		li1.add(40);
		li1.add(50);
		li1.add(60);
		li1.add(80);
		
		
	li.retainAll(li1);
	System.out.println(li);
		
		
		
		
		
		
		
		

	
	
	}
}
	
	
	
	
	
	
	
	
	
	
	

	

	
	
	
	
	
	
	

