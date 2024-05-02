package DesicionStateMent;

import java.util.Scanner;

public class DecisionMakingDemo002 {
public static void main(String []args) {
	//Even or odd numders//
	
	Scanner scan=  new Scanner(System.in);
	System.out.println("Enter number");
	 
	int num=scan.nextInt();
	
	if (num%2==0) {
	System.out.println("Even Number");
	}else {
	System.out.println("Odd Number");
	}
}

}
