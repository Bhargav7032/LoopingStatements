package DesicionStateMent;

import java.util.Scanner;

public class DecisionMaking {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter:");
	 String examstatus=scan.nextLine();
	
	//String examstatus="pass";
	if (examstatus.equals("pass")) {
		System.out.println("your please wait another Round1");
	String Round1=examstatus="pass";
	if(examstatus=="pass") {
		System.out.println("your please wait another Round2");
		String Round2=examstatus="pass";
		if (examstatus=="pass") {
		System.out.println("your please wait another HR Round");	
		String Round3=examstatus="pass";
		if (examstatus=="pass") {
		System.out.println("your Seleted offer letter getting soon");	
		}
	else {
		System.out.println("Betterluck Next time");
	}	
	}
	else {
		System.out.println("Betterluck Next time");
	}	
	}
	else {
		System.out.println("Betterluck Next time");
	}
	}
	else {
		System.out.println("Betterluck Next time");
	}
	}
	}
