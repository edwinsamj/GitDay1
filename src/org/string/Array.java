package org.string;
import java.util.*;

public class Array {
	public static void main(String[] args) {
	
	double d[][]=new double[3][3];
	
	
	d[0][0]=10.1;
	d[0][1]=10.2;
	d[0][2]=10.3;
	
	d[1][0]=20.1;
	d[1][1]=20.2;
	d[1][2]=20.3;
		
	d[2][0]=30.1;	
	d[2][1]=30.2;		
	d[2][2]=30.3;	
		
	for(double[] b:d) {
for(double e:b) {
	System.out.print(e+"\t");
}
	System.out.println();	
	}
		
		System.out.println();
	for(int i=0;i<d.length;i++) {
		for(int j=0;j<d.length;j++) {
			System.out.print(d[i][j]+"\t");
		}
		System.out.println();
	}
	
		
		}
	
}
