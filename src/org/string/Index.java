package org.string;

public class Index {
	
	static int lastIndex(String s , char c) {
		int lastIndexOf = s.lastIndexOf(c);
		return lastIndexOf;
	}
	static int indexOf(String s, char c) {
		int indexOf = s.indexOf(c);
		return indexOf;
		
	}
	
	public static void main(String[] args) {
		
		int lastIndex = lastIndex("greentechnology", 'o');
		System.out.println(lastIndex);
		
		
		int lastIndex2 = lastIndex("j a v a p r o g r a m", ' ');
		System.out.println(lastIndex2);
		
		
		
		int indexOf = indexOf("seleniumautomationtool", 'o');
		System.out.println(indexOf);
		
		
		int indexOf2 = indexOf("velmurugan", 'n');
		System.out.println(indexOf2);
		
		int indexOf3 = indexOf("9095484678", '8');
		System.out.println(indexOf3);
		
		
		
	}
	
	
	
	
	
	
	
}
