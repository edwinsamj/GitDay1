package org.string;
import java.util.*;

public class AddresVerification{
	
	static boolean veryfy() {
		Scanner add = new Scanner(System.in);
		System.out.println("enter your address");
		String s = add.nextLine();
		boolean contains = s.contains("pincode");
		return contains;
	}

	public static void main(String[] args) {
	
		boolean veryfy = veryfy();
		System.out.println(veryfy);
		
		if (veryfy == true) {
			System.out.println("valid address");
		}
		
		else {
			System.out.println("invalid address");
		}
	}
	
	
	
}
