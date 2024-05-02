package Ifelse;

import java.util.Scanner;

public class oddandeven {
	public static void main(String[] args) {
//		int num = 10;
//		System.out.println("num is even or odd:");
//		if (num % 2== 0) {
//			System.out.println("num is even");
//		} else {
//			System.out.println("num is odd.");
//		}
//	}
		Scanner scan=new Scanner(System.in);
   int num ;
   System.out.println("enter number");
   num=scan.nextInt();
	if( num%2==0)
	System.out.println("num is even");
	else 
	System.out.println("num is odd");	
	}
}
