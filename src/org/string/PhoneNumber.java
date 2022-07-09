package org.string;
import java.util.*;

public class PhoneNumber {
	
	static boolean check() {
		
		Scanner  ck = new Scanner (System.in);
		System.out.println("enter your phone number");
		String ph =ck.next();
		boolean equals = ph.equals("8807091620");
	return equals;
	
	
		
		
	}
	public static void main(String[] args) {
		
		boolean check = check();
		
		if(check==true) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
		
		
		
		
	}

}
