package org.string;
import java.util.*;

public class Contains {

static boolean	verification() {
	
	Scanner ver = new Scanner (System.in);
	System.out.println("enter your email id ");
	String s = ver.nextLine();
	
	boolean contains = s.contains("@");
	return contains;
	
	

}
public static void main(String[] args) {
	
	
	boolean verification = verification();
	
	
if(verification == true) {
	System.out.println("valid emailid");
}
else {
	System.out.println("invalid emailid");
}
	
}
}