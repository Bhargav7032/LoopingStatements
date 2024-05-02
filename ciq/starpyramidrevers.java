package com.ciq;

public class starpyramidrevers {
public static void main (String[]args) {
	int bagi=6;
	for(int i=1;i<=bagi;i++) {
	for(int j=bagi;j>=i;j--) {
		System.out.print("* ");
	}
	System.out.println();
	}
}
}
