package org.string;

public class Task {
	static String tryes(String s ,String s1, String s2) {
		String replace = s.replace(s1, s2);
		return replace;
	}
	
	
	public static void main(String[] args) {
		
		String tryes = tryes("E D W I N S A M", " ", "");
		System.out.println(tryes);
		
	}
	

}
