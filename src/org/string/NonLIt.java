package org.string;

public class NonLIt {

	
	static int name(String s) {
		String N = new String (s);
		int identityHashCode = System.identityHashCode(N);
		return identityHashCode;
	}
	
	public static void main(String[] args) {
		
		int name = name("Nisha");
		System.out.println("Nisha");
		System.out.println(name);
		
		int name2 = name("Nisha");
		System.out.println("Nisha");
		System.out.println(name2);
		
		
		int name3 = name("Rengan");
		System.out.println("rengan");
		System.out.println(name3);
		
		
		int name4 = name("NishaRengan");
		System.out.println("NishaRengan");
		System.out.println(name4);
		
		
		
		
	}
	
}
