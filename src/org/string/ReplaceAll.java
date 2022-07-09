package org.string;

public class ReplaceAll {
static String replace(String s,int i1,int i2) {
	String substring = s.substring(i1, i2);
	return substring;
}

public static void main(String[] args) {
	
	
	
	
	String replace = replace("Welcome to java class", 0, 7);
	System.out.println(replace);
}

}
