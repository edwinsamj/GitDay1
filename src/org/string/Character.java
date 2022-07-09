package org.string;

public class Character {
	
	static char print(String s,int index) {
		char charAt = s.charAt(index);
		return charAt;
	}
public static void main(String[] args) {
	
	char print = print("GreensTechnology", 9);
	System.out.println(print);
	
	char print2 = print("SeleniumAutomationtool", 11);
	System.out.println(print2);
	
    char print3 = print("velmurugan" , 4);
    System.out.println(print3);

    char print4 = print("j a v a p r o g r a m", 8);
    System.out.println(print4);

    
    char print5 = print("9095484678", 8);
    System.out.println(print5);
}
	
	
	
}
