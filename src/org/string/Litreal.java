package org.string;

public class Litreal {
	
	static int name(String s) {
		int identityHashCode = System.identityHashCode(s);
		return identityHashCode;
	}
	public static void main(String[] args) {
		
		
		int name = name("Nisha");
		System.out.println("Nisha");
		System.out.println(name);
		
		int name2 = name("Nisha");
		System.out.println("Nisha");
		System.out.println(name2);
		
	}

	
	
	

}
