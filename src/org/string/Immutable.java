package org.string;

public class Immutable {

	static int name(String s) {
		int identityHashCode = System.identityHashCode(s);
		return identityHashCode;
	
	}
	static int name1(String s1) {
		int identityHashCode = System.identityHashCode(s1);
		return identityHashCode;
		
	}
	static int connect(String name,String name1) {
		String concat = name.concat("name1");
		int identityHashCode = System.identityHashCode(concat);
		return identityHashCode;
	}
	public static void main(String[] args) {
		
		int name = name("edwin");
		System.out.println( name);
		int name1 = name1("sam");
		System.out.println( name1);
		
		int connect = connect("edwin", "sam");
		System.out.println(connect);
	}
		
	}
	
	
	
	
	
	
	
	

