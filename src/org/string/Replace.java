package org.string;

public class Replace {
	
static String replace (String s ,String s1,String s2) {
	String replace = s.replace(s1, s2);
	return replace;
}
static String output(String  replace , char d1,char d2) {
	String replace2 = replace.replace(d1, d2);
	return replace2;
	
}


	
	public static void main(String[] args) {
		
		String replace = replace("welcome", "e", "@");
		System.out.println(replace);
		
		
		String output = output(replace,'o', '@');
		System.out.println(output);

		
	}
}
